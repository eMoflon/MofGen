package org.mofgen.build

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.mofgen.interpreter.TypeCalculator
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.Collection
import org.mofgen.mGLang.CollectionManipulation
import org.mofgen.mGLang.ForHead
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.Import
import org.mofgen.mGLang.IteratorVariable
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.Literal
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NullLiteral
import org.mofgen.mGLang.Parameter
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.Primary
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.RefOrCall
import org.mofgen.mGLang.RefParams
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.Tertiary
import org.mofgen.mGLang.UnaryMinus
import org.mofgen.mGLang.Variable
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.util.MofgenUtil
import org.mofgen.util.NameProvider

class GeneralTranslator {

	static TypeCalculator typeChecker = new TypeCalculator()

	def static String translate(EObject obj) {
		if (obj === null) {
			throw new IllegalArgumentException("Cannot translate null")
		}
		return internalTranslate(obj)
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
			RangeForHead: '''int «head.iteratorVar.name» = «MofgenUtil.getTextFromEditorFile(head.range.start)»; «head.iteratorVar.name» <= «MofgenUtil.getTextFromEditorFile(head.range.end)»; «head.iteratorVar.name»++'''
			GeneralForEachHead: {
				var typeString = ""
				var collectionString = ""
				if (head.eref == TypeModelPackage.Literals.MAP__ENTRIES) {
					typeString = MofgenUtil.getMapEntryType(head.src.ref as Map).name
					collectionString = '''«MofgenUtil.getTextFromEditorFile(head.src)».values()'''
				} else if (head.eref == TypeModelPackage.Literals.MAP__KEYS) {
					typeString = MofgenUtil.getMapKeyType(head.src.ref as Map).name
					collectionString = '''«MofgenUtil.getTextFromEditorFile(head.src)».keySet()'''
				} else {
					typeString = head.eref.name
					collectionString = '''«MofgenUtil.getTextFromEditorFile(head.src)».«NameProvider.getGetterName(head.eref)»()'''
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

		return '''«coll.name».«op.name»(«internalTranslate(params)»)'''
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
					case SQRT: return '''Math.sqrt(«translate(ae.expr)»'''
					case ABS: return '''Math.abs(«translate(ae.expr)»'''
				}
			}
			NegationExpression:
				return '''!«translate(ae.expr)»'''
			Rel: {
				var emptyCollectionSuffix = ""
				if ((ae.left instanceof NullLiteral || ae.right instanceof NullLiteral)) {
					val leftEval = typeChecker.evaluate(ae.left)
					if (leftEval instanceof EClass) {
						if (TypeModelPackage.Literals.COLLECTION.isSuperTypeOf(leftEval)) {
							switch (ae.relation) {
								case EQUAL:	emptyCollectionSuffix = '''|| «translate(ae.left)».isEmpty()'''
								case UNEQUAL: 	emptyCollectionSuffix = '''&& !«translate(ae.left)».isEmpty()'''
								default: {
								}
							}
						}
					} 
					val rightEval = typeChecker.evaluate(ae.right)
					if (rightEval instanceof EClass) {
						if (TypeModelPackage.Literals.COLLECTION.isSuperTypeOf(rightEval)) {
							switch (ae.relation) {
								case EQUAL: emptyCollectionSuffix = '''|| «translate(ae.right)».isEmpty()'''
								case UNEQUAL: emptyCollectionSuffix = '''&& !«translate(ae.right)».isEmpty()'''
								default: {
								}
							}
						}
					} 
				}
				return '''«translate(ae.left)»«ae.relation.literal»«translate(ae.right)»«emptyCollectionSuffix»'''
			}
			Primary:
				return '''«translate(ae.left)»«ae.op.literal»«translate(ae.right)»'''
			Secondary:
				return '''«translate(ae.left)»«ae.op.literal»«translate(ae.right)»'''
			Tertiary:
				return '''«translate(ae.left)»«ae.op.literal»«translate(ae.right)»'''
			default:
				return MofgenUtil.getTextFromEditorFile(ae)
		}
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
		val calc = new TypeCalculator()

		if (neededParameter instanceof PrimitiveParameter) {
			val neededParameterType = neededParameter.type
			var givenParameterType = calc.evaluate(givenParam)
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
				val givenParamEval = calc.evaluate(givenParam)
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
}
