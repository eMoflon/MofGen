package org.mofgen.build

import org.mofgen.mGLang.PatternCall
import org.mofgen.util.NameProvider
import org.mofgen.util.MofgenUtil
import org.mofgen.mGLang.ForHead
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.Import
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.mGLang.RefOrCall
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EEnum
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.Variable
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.Literal
import org.mofgen.mGLang.UnaryMinus
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.Primary
import org.mofgen.mGLang.Tertiary
import org.mofgen.interpreter.TypeRegistry
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.mGLang.Map

class GeneralTranslator {

	def static String translatePatternCall(PatternCall pc) {
		val pReturn = pc.called.^return
		if (pReturn !== null && pReturn.returnValue !== null) {
			return '''(new «NameProvider.getPatternClassName(pc.called)»(«IF pc.params.params.empty»))«ELSE»«FOR param : pc.params.params SEPARATOR ',' AFTER ')'» «MofgenUtil.getTextFromEditorFile(param)»«ENDFOR»)«ENDIF».«MofgenUtil.getGetterMethod(pReturn.returnValue)»
			'''
		} else {
			return '''new «NameProvider.getPatternClassName(pc.called)»(«IF pc.params.params.empty»)«ELSE»«FOR param : pc.params.params SEPARATOR ',' AFTER ')'» «MofgenUtil.getTextFromEditorFile(param)»«ENDFOR»
				«ENDIF»
			'''
		}
	}

	def static String translateForHead(ForHead head) {
		val headSrc = switch head {
			RangeForHead: '''int «head.iteratorVar.name» = «MofgenUtil.getTextFromEditorFile(head.range.start)»; «head.iteratorVar.name» <= «MofgenUtil.getTextFromEditorFile(head.range.end)»; «head.iteratorVar.name»++'''
			GeneralForEachHead: {
				var typeString = ""
				var collectionString = ""
				if(head.eref == TypeModelPackage.Literals.MAP__ENTRIES){
					typeString = TypeRegistry.getMapEntryType(head.src.ref as Map).name
					collectionString = '''«MofgenUtil.getTextFromEditorFile(head.src)».values()'''
				}else if(head.eref == TypeModelPackage.Literals.MAP__KEYS){
					typeString = TypeRegistry.getMapEntryType(head.src.ref as Map).name
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
	
	/**
	 * translates the given arithmetic expression to source code
	 */
	def static String translateArithmeticExpression(ArithmeticExpression ae) {
		switch ae {
			RefOrCall:
				return translateRefOrCall(ae)
			Literal:
				return MofgenUtil.getTextFromEditorFile(ae)
			PatternCall:
				return GeneralTranslator.translatePatternCall(ae)
			UnaryMinus:
				return '''-«translateArithmeticExpression(ae.expr)»'''
			FunctionCall: {
				switch ae.func {
					case SQRT: return '''Math.sqrt(«translateArithmeticExpression(ae.expr)»'''
					case ABS: return '''Math.abs(«translateArithmeticExpression(ae.expr)»'''
				}
			}
			NegationExpression:
				return '''!«translateArithmeticExpression(ae.expr)»'''
			Rel:
				return '''«translateArithmeticExpression(ae.left)»«ae.relation.literal»«translateArithmeticExpression(ae.right)»'''
			Primary:
				return '''«translateArithmeticExpression(ae.left)»«ae.op.literal»«translateArithmeticExpression(ae.right)»'''
			Secondary:
				return '''«translateArithmeticExpression(ae.left)»«ae.op.literal»«translateArithmeticExpression(ae.right)»'''
			Tertiary:
				return '''«translateArithmeticExpression(ae.left)»«ae.op.literal»«translateArithmeticExpression(ae.right)»'''
			default:
				return MofgenUtil.getTextFromEditorFile(ae)
		}
	}

	/**
	 * Translates References or calls to source code for the auto-generated classes.
	 * @param roc the RefOrCall object
	 * @return the source code as string
	 */
	def static String translateRefOrCall(RefOrCall roc) {
		val ref = roc.ref
		switch ref {
			ENamedElement: {
				var prefix = ""
				var suffix = "()"
				if (roc.target !== null) {
					prefix = '''«translateRefOrCall(roc.target)».'''
				}
				if (roc.ref instanceof EEnum || roc.ref instanceof EEnumLiteral) {
					suffix = ""
				}
				return '''«prefix»«NameProvider.getGetterName(ref)»«suffix»'''
			}
			Node: {
				if (roc.target !== null) {
					return '''«translateRefOrCall(roc.target)».«ref.name»'''
				} else {
					return ref.name
				}
			}
			Variable: {
				if (roc.target !== null) {
					return '''«translateRefOrCall(roc.target)».«ref.name»'''
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
					return '''«translateRefOrCall(roc.target)».«MofgenUtil.getTextFromEditorFile(ref)»'''
				} else {
					return MofgenUtil.getTextFromEditorFile(ref)
				}
			}
		}
	}
}
