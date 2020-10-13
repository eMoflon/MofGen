package org.mofgen.build

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
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.PatternReturn

class PatternTranslator {

	static def String translate(Node node, NodeReferenceOrAssignmentOrControlFlow refAssign){
		return internalTranslate(node, refAssign);
	}
	
	private static dispatch def String internalTranslate(Node node, PatternNodeReference ref){
		if(ref.type.upperBound < 1){
			return '''
			«node.name».«NameProvider.getGetterName(ref.type)»().add(«ref.target.name»)
			'''	
		}else{
			return '''
		«node.name».«NameProvider.getSetterName(ref.type)»(«ref.target.name»)
		'''	
		}
	}
	
	private static dispatch def String internalTranslate(Node node, NodeAttributeAssignment ass){
		return '''
		«node.name».«NameProvider.getSetterName(ass.target)»(«MofgenUtil.resolveArithmeticExpression(ass.value)»);
		'''
	}
	
	static def String translate(PatternCall pc){
		return '''
		(new «NameProvider.getPatternClassName(pc.called)»().createInstance(«IF pc.params.params.empty»);«ELSE»«FOR param : pc.params.params SEPARATOR ',' AFTER ')'» «MofgenUtil.getTextFromEditorFile(param)»«ENDFOR»«ENDIF»)
		'''
	}
	
	static def String translate(PatternReturn pReturn){
		if(pReturn.returnValue !== null){
			return '''return «pReturn.returnValue.name»;'''
		}else{
			//TODO return Pattern as a whole?
		}
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