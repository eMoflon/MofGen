package org.mofgen.build

import org.mofgen.mGLang.PatternCall
import org.mofgen.util.NameProvider
import org.mofgen.util.MofgenUtil
import org.mofgen.mGLang.ForHead
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.ListForEachHead

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
			GeneralForEachHead: '''«head.eref.EReferenceType.name» «head.iteratorVar.name» : «MofgenUtil.getTextFromEditorFile(head.src)».«NameProvider.getGetterName(head.eref)»() '''
			ListForEachHead: '''«MofgenUtil.getListType(head.list).name» «head.iteratorVar.name» : «head.list.name»'''
		}
		return headSrc
	}
}
