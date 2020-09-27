package org.mofgen.core.codegen

import org.mofgen.mGLang.NodeReferenceOrAssignmentOrControlFlow
import org.mofgen.mGLang.PatternNodeReference
import org.mofgen.mGLang.NodeAttributeAssignment
import org.mofgen.mGLang.PatternSwitch
import org.mofgen.util.NameProvider
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.PatternIfElseSwitch
import org.mofgen.mGLang.PatternSwitchCase
import org.mofgen.mGLang.PatternCaseBody

class PatternTranslator {

	static def translate(Node node, NodeReferenceOrAssignmentOrControlFlow refAssign){
		return internalTranslate(node, refAssign);
	}
	
	private static dispatch def internalTranslate(Node node, PatternNodeReference ref){
		return '''
		«node.name».«NameProvider.getSetterName(ref.type)»(«ref.target»)
		'''
	}
	
	private static dispatch def internalTranslate(Node node, NodeAttributeAssignment ass){
		return '''
		«node.name».«NameProvider.getSetterName(ass.target)»(«ass.value»)
		'''
	}
	
	private static dispatch def internalTranslate(Node node, PatternIfElseSwitch pSwitch){
		return '''
			«FOR caze : pSwitch.cases SEPARATOR 'else'»
				if(«caze.when»){
					«FOR refAssign : caze.body.expressions SEPARATOR ';'»
						«translate(node, refAssign)»
					«ENDFOR»
				}
			«ENDFOR»
			«IF pSwitch.^default !== null»
				else{
					«FOR refAssign : (pSwitch.^default as PatternCaseBody).expressions SEPARATOR ';'»
						«translate(node, refAssign)»
					«ENDFOR»
				}
			«ENDIF»
		'''
	}
		
	private static dispatch def internalTranslate(Node node, PatternSwitchCase pSwitch){
		// TODO
	}
		
}