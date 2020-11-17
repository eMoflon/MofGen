package org.mofgen.build

import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.ForHead
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.Import
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.Literal
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.Primary
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.RefOrCall
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.Tertiary
import org.mofgen.mGLang.UnaryMinus
import org.mofgen.mGLang.Variable
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.util.MofgenUtil
import org.mofgen.util.NameProvider
import org.mofgen.mGLang.CollectionManipulation
import org.mofgen.mGLang.RefParams

class GeneralTranslator {

	def static String translate(EObject obj){
		return internalTranslate(obj)
	}

	private def static dispatch String internalTranslate(PatternCall pc) {
		val pReturn = pc.called.^return
		
		val paramsTranslated = newLinkedList()
		for(var i = 0; i < pc.params.params.size; i++){
			paramsTranslated.add(MofgenUtil.convertIfPrimitiveCastNeeded(pc.called.parameters.get(i), pc.params.params.get(i)))
		}
		
		// TODO only write "getAttribute()"-Part if it is explicitly needed. Not for every pattern call where no return value is needed.
		if (pReturn !== null && pReturn.returnValue !== null) {
			return '''(new «NameProvider.getPatternClassName(pc.called)»(«IF pc.params.params.empty»))«ELSE»«FOR paramText : paramsTranslated SEPARATOR ',' AFTER ')'» «paramText»
			«ENDFOR»)«ENDIF».«MofgenUtil.getGetterMethod(pReturn.returnValue)»
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
				if(head.eref == TypeModelPackage.Literals.MAP__ENTRIES){
					typeString = MofgenUtil.getMapEntryType(head.src.ref as Map).name
					collectionString = '''«MofgenUtil.getTextFromEditorFile(head.src)».values()'''
				}else if(head.eref == TypeModelPackage.Literals.MAP__KEYS){
					typeString = MofgenUtil.getMapKeyType(head.src.ref as Map).name
					collectionString = '''«MofgenUtil.getTextFromEditorFile(head.src)».keySet()'''
				}else{
					typeString = head.eref.name
					collectionString = '''«MofgenUtil.getTextFromEditorFile(head.src)».«NameProvider.getGetterName(head.eref)»()'''
				}
				
				'''«typeString» «head.iteratorVar.name» : «collectionString» '''
			}
			ListForEachHead: '''«MofgenUtil.getListType(head.list).name» «head.iteratorVar.name» : «head.list.name»'''
		}
		return headSrc
	}
	
	private def static dispatch String internalTranslate(CollectionManipulation cm){
		val coll = cm.trg
		val op = cm.op
		val params = cm.params
		
		return '''«coll.name».«op.name»(«internalTranslate(params)»)'''
	}
	
	private def static dispatch String internalTranslate(RefParams refParams){
		val params = refParams.params
		if(params.empty){
			return ""
		}
		
		return
		'''
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
			Rel:
				return '''«translate(ae.left)»«ae.relation.literal»«translate(ae.right)»'''
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
				if (roc.target !== null) {
					prefix = '''«translate(roc.target)».'''
				}
				if (roc.ref instanceof EEnum || roc.ref instanceof EEnumLiteral) {
					suffix = ""
				}
				return '''«prefix»«NameProvider.getGetterName(ref)»«suffix»'''
			}
			Node: {
				if (roc.target !== null) {
					return '''«translate(roc.target)».«ref.name»'''
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
			Import: {
				return MofgenUtil.getEPackage(ref.uri).name
			}
			ParameterNodeOrPattern: {
				return ref.name
			}
			PrimitiveParameter: {
				return ref.name
			}
			default: {
				if (roc.target !== null) {
					return '''«translate(roc.target)».«MofgenUtil.getTextFromEditorFile(ref)»'''
				} else {
					return MofgenUtil.getTextFromEditorFile(ref)
				}
			}
		}
	}
}
