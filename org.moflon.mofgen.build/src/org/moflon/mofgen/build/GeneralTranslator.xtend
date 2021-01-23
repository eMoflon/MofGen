package org.moflon.mofgen.build

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.moflon.mofgen.build.util.MofgenUtil
import org.moflon.mofgen.build.util.NameProvider
import org.moflon.mofgen.interpreter.MismatchingTypesException
import org.moflon.mofgen.interpreter.TypeCalculator
import org.moflon.mofgen.mGLang.ArithmeticExpression
import org.moflon.mofgen.mGLang.BracketExpression
import org.moflon.mofgen.mGLang.Collection
import org.moflon.mofgen.mGLang.CollectionManipulation
import org.moflon.mofgen.mGLang.ForHead
import org.moflon.mofgen.mGLang.FunctionCall
import org.moflon.mofgen.mGLang.GeneralForEachHead
import org.moflon.mofgen.mGLang.Import
import org.moflon.mofgen.mGLang.IteratorVariable
import org.moflon.mofgen.mGLang.ListForEachHead
import org.moflon.mofgen.mGLang.Literal
import org.moflon.mofgen.mGLang.Map
import org.moflon.mofgen.mGLang.NegationExpression
import org.moflon.mofgen.mGLang.Node
import org.moflon.mofgen.mGLang.NullLiteral
import org.moflon.mofgen.mGLang.Parameter
import org.moflon.mofgen.mGLang.ParameterNodeOrPattern
import org.moflon.mofgen.mGLang.PatternCall
import org.moflon.mofgen.mGLang.Primary
import org.moflon.mofgen.mGLang.PrimitiveParameter
import org.moflon.mofgen.mGLang.RangeForHead
import org.moflon.mofgen.mGLang.RefOrCall
import org.moflon.mofgen.mGLang.RefParams
import org.moflon.mofgen.mGLang.Rel
import org.moflon.mofgen.mGLang.RelationalOp
import org.moflon.mofgen.mGLang.Secondary
import org.moflon.mofgen.mGLang.Tertiary
import org.moflon.mofgen.mGLang.UnaryMinus
import org.moflon.mofgen.mGLang.Variable
import org.moflon.mofgen.typeModel.TypeModelPackage

class GeneralTranslator {

	def static String translate(EObject obj) {
		if (obj === null) {
			throw new IllegalArgumentException("Cannot translate null")
		}
		return internalTranslate(obj)
	}

	private def static String translate(RelationalOp op) {
		if (op == RelationalOp.EQUAL_IDENTITY) {
			return '=='
		}
		if (op == RelationalOp.UNEQUAL_IDENTITY) {
			return '!='
		}
		return op.literal
	}

	private def static dispatch String internalTranslate(PatternCall pc) {
		val pReturn = pc.called.^return

		val paramsTranslated = newLinkedList()
		for (var i = 0; i < pc.params.params.size; i++) {
			paramsTranslated.add(convertIfPrimitiveCastNeeded(pc.called.parameters.get(i), pc.params.params.get(i)))
		}

		// TODO only generate "get<Attribute>()"-Part if it is explicitly needed. Not for every pattern call where no return value is needed.
		if (pReturn !== null && pReturn.retValue !== null && !pReturn.retValue.thisUsed) {
			return '''(new «NameProvider.getPatternClassName(pc.called)»(«IF pc.params.params.empty»))«ELSE»«FOR paramText : paramsTranslated SEPARATOR ',' AFTER ')'» «paramText»
			«ENDFOR»)«ENDIF».«MofgenUtil.getGetterMethod(pReturn)»
			'''
		} else {
			return '''new «NameProvider.getPatternClassName(pc.called)»(«IF pc.params.params.empty»)«ELSE»«FOR paramText : paramsTranslated SEPARATOR ',' AFTER ')'» «paramText»«ENDFOR»
				«ENDIF»
			'''
		}
	}

	private def static dispatch String internalTranslate(ForHead head) {
		val headSrc = switch head {
			RangeForHead: '''int «head.iteratorVar.name» = «translate(head.range.start)»; «head.iteratorVar.name» <= «translate(head.range.end)»; «head.iteratorVar.name»++'''
			GeneralForEachHead: {
				var typeString = ""
				var collectionString = ""
				if (head.eref == TypeModelPackage.Literals.MAP__ENTRIES) {
					typeString = MofgenUtil.getMapEntryType(head.src.ref as Map).name
					collectionString = '''«translate(head.src)».values()'''
				} else if (head.eref == TypeModelPackage.Literals.MAP__KEYS) {
					typeString = MofgenUtil.getMapKeyType(head.src.ref as Map).name
					collectionString = '''«translate(head.src)».keySet()'''
				} else {
					typeString = head.eref.name
					collectionString = '''«translate(head.src)».«NameProvider.getGetterName(head.eref)»()'''
				}

				'''«typeString» «head.iteratorVar.name» : «collectionString» '''
			}
			ListForEachHead: '''«MofgenUtil.getListType(head.list).name» «head.iteratorVar.name» : «head.list.name»'''
		}
		return headSrc
	}

	private def static dispatch String internalTranslate(CollectionManipulation cm) {
		val coll = cm.trg
		val op = cm.op
		val params = cm.params

		return '''«coll.name».«translateCollectionManipulationOperationName(op)»(«internalTranslate(params)»)'''
	}
	
	private def static String translateCollectionManipulationOperationName(EOperation op){
		if(op == TypeModelPackage.Literals.LIST___REMOVE_AT__INT){
			return TypeModelPackage.Literals.LIST___REMOVE__EOBJECT.name
		}else{
			return op.name
		}
	}

	private def static dispatch String internalTranslate(RefParams refParams) {
		val params = refParams.params
		if (params.empty) {
			return ""
		}

		return '''
			«FOR param : params SEPARATOR ','»
				«translate(param)»
			«ENDFOR»
		'''
	}

	/**
	 * translates the given arithmetic expression to source code
	 */
	private def static dispatch String internalTranslate(ArithmeticExpression ae) {
		switch ae {
			RefOrCall:
				return translate(ae)
			NullLiteral:
				return "null"
			Literal:
				return MofgenUtil.getTextFromEditorFile(ae)
			PatternCall:
				return translate(ae)
			UnaryMinus:
				return '''-«translate(ae.expr)»'''
			FunctionCall: {
				switch ae.func {
					case SQRT: return '''Math.sqrt(«translate(ae.expr)»)'''
					case ABS: return '''Math.abs(«translate(ae.expr)»)'''
				}
			}
			NegationExpression:
				return '''!«translate(ae.expr)»'''
			Rel: {
				var emptyCollectionSuffix = ""
				val leftEval = calculateType(ae.left)
				val rightEval = calculateType(ae.right)
				if ((ae.left instanceof NullLiteral || ae.right instanceof NullLiteral)) {

					if (leftEval instanceof EClass) {
						if (TypeModelPackage.Literals.COLLECTION.isSuperTypeOf(leftEval)) {
							switch (ae.relation) {
								case EQUAL:
									emptyCollectionSuffix = '''|| «translate(ae.left)».isEmpty()'''
								case UNEQUAL:
									emptyCollectionSuffix = '''&& !«translate(ae.left)».isEmpty()'''
								default: {
								}
							}
						}
					}
					if (rightEval instanceof EClass) {
						if (TypeModelPackage.Literals.COLLECTION.isSuperTypeOf(rightEval)) {
							switch (ae.relation) {
								case EQUAL:
									emptyCollectionSuffix = '''|| «translate(ae.right)».isEmpty()'''
								case UNEQUAL:
									emptyCollectionSuffix = '''&& !«translate(ae.right)».isEmpty()'''
								default: {
								}
							}
						}
					}
				}

				if (leftEval instanceof EClass) {
					if (rightEval instanceof EClass) {
						if (leftEval !== TypeModelPackage.Literals.NULL_OBJECT &&
							rightEval !== TypeModelPackage.Literals.NULL_OBJECT) {
							if (ae.relation == RelationalOp.EQUAL&&
								!TypeModelPackage.Literals.PRIMITIVE.isSuperTypeOf(leftEval) &&
								!TypeModelPackage.Literals.PRIMITIVE.isSuperTypeOf(leftEval)) {
									// TODO What to use here?
									if (isClassImplementingEquals(leftEval)) {
										return '''«translate(ae.left)».equals(«translate(ae.right)»)'''
									} else {
										return '''(new EcoreUtil.EqualityHelper()).equals(«translate(ae.left)», «translate(ae.right)»)'''
									}
							}
							if (ae.relation == RelationalOp.UNEQUAL &&
								!TypeModelPackage.Literals.PRIMITIVE.isSuperTypeOf(leftEval) &&
								!TypeModelPackage.Literals.PRIMITIVE.isSuperTypeOf(leftEval)) {

								// TODO What to use here?
								if (isClassImplementingEquals(leftEval)) {
									return '''!«translate(ae.left)».equals(«translate(ae.right)»)'''
								} else {
									return '''!(new EcoreUtil.EqualityHelper()).equals(«translate(ae.left)», «translate(ae.right)»)'''
								}

							}
						}
					}
				}

				return '''«translate(ae.left)»«translate(ae.relation)»«translate(ae.right)»«emptyCollectionSuffix»'''
			}
			Primary:
				return '''«translate(ae.left)»«ae.op.literal»«translate(ae.right)»'''
			Secondary:
				return '''«translate(ae.left)»«ae.op.literal»«translate(ae.right)»'''
			Tertiary:
				return '''«translate(ae.left)»«ae.op.literal»«translate(ae.right)»'''
			BracketExpression:
				return '''(«translate(ae.expr)»)'''
			default:
				return MofgenUtil.getTextFromEditorFile(ae)
		}
	}

	private static def isClassImplementingEquals(EClass eClass) {
		if(eClass == TypeModelPackage.Literals.STRING){
			return true;
		}
		val allOps = eClass.EAllOperations
		for (op : allOps) {
			if (op.name.equals("equals")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Translates References or calls to source code for the auto-generated classes.
	 * @param roc the RefOrCall object
	 * @return the source code as string
	 */
	private def static dispatch String internalTranslate(RefOrCall roc) {
		val ref = roc.ref
		switch ref {
			ENamedElement: {
				var prefix = ""
				var suffix = "()"
				var element = ref.name
				if (roc.target !== null) {
					prefix = '''«translate(roc.target)».'''
				}
				if (ref instanceof EEnum || ref instanceof EEnumLiteral) {
					suffix = ""
				}
				if (ref instanceof EAttribute || ref instanceof EReference) {
					element = NameProvider.getGetterName(ref)
				} else {
					if (roc.params !== null) {
						suffix = '''(«translate(roc.params)»)'''
					}
				}
				return '''«prefix»«element»«suffix»'''
			}
			Node: {
				if (roc.target !== null && !roc.target.thisUsed) {
					return '''«translate(roc.target)».«NameProvider.getGetterName(ref)»()'''
				} else {
					return ref.name
				}
			}
			Variable: {
				if (roc.target !== null) {
					return '''«translate(roc.target)».«ref.name»'''
				} else {
					return ref.name
				}
			}
			IteratorVariable:
				return ref.name
			Import: {
				return MofgenUtil.getEPackage(ref.uri).name
			}
			ParameterNodeOrPattern: {
				return NameProvider.getParameterName(ref)
			}
			PrimitiveParameter: {
				return NameProvider.getParameterName(ref)
			}
			Collection: {
				return ref.name
			}
			default: {
				if (roc.target !== null) {
					return '''«translate(roc.target)».«translate(ref)»'''
				} else {
					return translate(ref)
				}
			}
		}
	}

	/**
	 * returns a translation that also contains a cast between the given and needed parameter,
	 * as long as it is between primitive types and string. if there is no need to cast,
	 * the normal translation will be returned.
	 */
	def static convertIfPrimitiveCastNeeded(Parameter neededParameter, ArithmeticExpression givenParam) {

		if (neededParameter instanceof PrimitiveParameter) {
			val neededParameterType = neededParameter.type
			var givenParameterType = calculateType(givenParam)
			if (givenParameterType === EcorePackage.Literals.ESTRING) {
				if (neededParameterType.literal.equals("int")) {
					return '''Integer.valueOf(«translate(givenParam)»)'''
				}
				if (neededParameterType.literal.equals("double")) {
					return '''Double.valueOf(«translate(givenParam)»)'''
				}
				if (neededParameterType.literal.equals("boolean")) {
					return '''Boolean.valueOf(«translate(givenParam)»)'''
				}
			}
		}

		if (neededParameter instanceof ParameterNodeOrPattern) {
			if (neededParameter.type === EcorePackage.Literals.ESTRING) {
				val givenParamEval = calculateType(givenParam)
				if (givenParamEval instanceof EDataType &&
					MofgenUtil.isDataTypePrimitive(givenParamEval as EDataType)) {
					return '''String.valueOf(«translate(givenParam)»)'''
				}
				if (givenParamEval instanceof EClass &&
					TypeModelPackage.Literals.NUMBER.isSuperTypeOf(givenParamEval as EClass)) {
					return '''String.valueOf(«translate(givenParam)»)'''
				}
			}
		}
		return translate(givenParam)
	}

	def private static EObject calculateType(ArithmeticExpression ae) {
		try {
			return TypeCalculator.evaluate(ae)
		} catch (MismatchingTypesException e) {
			/*
			 * Nothing to do, needs to be fixed in validator.
			 */
		}
	}

}
