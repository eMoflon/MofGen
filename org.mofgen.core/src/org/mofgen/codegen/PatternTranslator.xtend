package org.mofgen.codegen

import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NodeAttributeAssignment
import org.mofgen.mGLang.NodeReferenceOrAssignmentOrControlFlow
import org.mofgen.mGLang.PatternCaseBody
import org.mofgen.mGLang.PatternCaseWithCast
import org.mofgen.mGLang.PatternCaseWithoutCast
import org.mofgen.mGLang.PatternIfElseSwitch
import org.mofgen.mGLang.PatternNodeReference
import org.mofgen.mGLang.PatternSwitchCase
import org.mofgen.util.NameProvider
import org.mofgen.util.MofgenUtil

class PatternTranslator {

	static def String translate(Node node, NodeReferenceOrAssignmentOrControlFlow refAssign){
		return internalTranslate(node, refAssign);
	}
	
	private static dispatch def String internalTranslate(Node node, PatternNodeReference ref){
		//TODO *-reference / collection --> Add to collection instead of setting attribute
		return '''
		«node.name».«NameProvider.getSetterName(ref.type)»(«ref.target.name»)
		'''
	}
	
	private static dispatch def String internalTranslate(Node node, NodeAttributeAssignment ass){
		return '''
		«node.name».«NameProvider.getSetterName(ass.target)»(«MofgenUtil.getTextFromEditorFile(ass.value)»)
		'''
	}
	
	private static dispatch def String internalTranslate(Node node, PatternIfElseSwitch pSwitch){
		return '''
			«FOR caze : pSwitch.cases SEPARATOR 'else'»
				if(«MofgenUtil.getTextFromEditorFile(caze.when)»){
					«FOR refAssign : caze.body.expressions SEPARATOR ';'AFTER';'»
						«translate(node, refAssign)»
					«ENDFOR»
				}
			«ENDFOR»
			«IF pSwitch.^default !== null»
				else{
					«FOR refAssign : (pSwitch.^default as PatternCaseBody).expressions SEPARATOR';'AFTER';'»
						«translate(node, refAssign)»
					«ENDFOR»
				}
			«ENDIF»
		'''
	}
		
	private static dispatch def String internalTranslate(Node node, PatternSwitchCase zwitch){
		return
		'''
		«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
			«IF caze instanceof PatternCaseWithCast»
				if(«zwitch.attribute» instanceof «caze.node.type.instanceTypeName»){
					«caze.node.type.instanceTypeName»«caze.node.name» = («caze.node.type.instanceTypeName»)«zwitch.attribute»
					«IF caze.when !== null»
						if(«MofgenUtil.getTextFromEditorFile(caze.when)»){
					«ENDIF»
					«FOR bodyExpr : caze.body.expressions SEPARATOR';'AFTER';'»
						«internalTranslate(node, bodyExpr)»
					«ENDFOR»
					«IF caze.when !== null»
						}
					«ENDIF»
				}
			«ENDIF»
			«IF caze instanceof PatternCaseWithoutCast»
				if(«MofgenUtil.resolveRefOrCall(zwitch.attribute)»  == «MofgenUtil.getTextFromEditorFile(caze.^val)»){
					«FOR bodyExpr : caze.body.expressions SEPARATOR';'AFTER';'»
						«internalTranslate(node, bodyExpr)»
					«ENDFOR»
				}
			«ENDIF»
		«ENDFOR»
		«IF zwitch.^default !== null»
			else {
				«FOR expression : (zwitch.^default as PatternCaseBody).expressions SEPARATOR';'AFTER';'»
					«internalTranslate(node, expression)»
				«ENDFOR»
			}
		«ENDIF»
		'''
	}
		
}