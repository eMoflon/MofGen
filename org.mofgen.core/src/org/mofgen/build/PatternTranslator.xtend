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
import org.mofgen.mGLang.Pattern
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.mGLang.PrimitiveParameter
import org.eclipse.emf.ecore.EClass
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.NodeContent

class PatternTranslator {

	static def String translate(Pattern pattern){
		
		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)

		val patternParameterTypes = newHashMap();
		if (!pattern.parameters.empty) {
			for (parameter : pattern.parameters) {
				if (parameter instanceof PrimitiveParameter) {
					patternParameterTypes.put(parameter, parameter.type.literal)
				} else if (parameter instanceof ParameterNodeOrPattern) {
					val type = parameter.type
					if (type instanceof EClass) {
						patternParameterTypes.put(parameter, type.name)
					} else if (type instanceof Pattern) {
						patternParameterTypes.put(parameter, NameProvider.getPatternClassName(type))
					} else {
						throw new IllegalStateException();
					}
				} else {
					throw new IllegalStateException();
				}

			}
		}
		return
		'''
		«getPatternDoc(pattern)»
		«getPatternSignature(pattern)»
			
			«FOR node : nodes SEPARATOR ';' AFTER ';'»
				«node.type.name» «node.name»
			«ENDFOR»
			
			public «NameProvider.getPatternClassName(pattern)»(«IF !pattern.parameters.empty»«FOR entry : patternParameterTypes.entrySet SEPARATOR ','»«entry.value» «entry.key.name»
			«ENDFOR»«ENDIF»){
				«FOR node : nodes SEPARATOR ';'»
					«node.name» = «MofgenUtil.getCreationOfEObject(node.type)»;
					«IF node.createdBy instanceof NodeContent»
						«FOR refAssign : (node.createdBy as NodeContent).refsAssigns SEPARATOR ';'»
							«PatternTranslator.translate(node, refAssign)»
							«ENDFOR»
					«ENDIF»
					«IF node.createdBy instanceof PatternCall»
						«PatternTranslator.translate(node.createdBy as PatternCall)»
					«ENDIF»
				«ENDFOR»
			}
				
			«PatternTranslator.createGetters(pattern)»
		}'''
	}
	
	private static def getPatternDoc(Pattern pattern){
		return
		'''/**
			* The pattern «NameProvider.getPatternClassName(pattern)».
			*/
		'''
	}
	
	private static def getPatternSignature(Pattern pattern){
		return '''
		public class «NameProvider.getPatternClassName(pattern)» extends «JavaFileGenerator.PATTERN_SUPER_CLASS»{
		'''
	}

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
	
	static def createGetters(Pattern pattern){
		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
		return '''
		
		«FOR node : nodes»
		/**
		* @return the «node.name» attribute of type «node.type.name»
		*/
		public «node.type.name» «MofgenUtil.getGetterMethod(node)»{
			return «node.name»;
		}
		
		«ENDFOR»
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