package org.mofgen.build

import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NodeAttributeAssignment
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.Pattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.PatternCaseBody
import org.mofgen.mGLang.PatternCaseWithCast
import org.mofgen.mGLang.PatternCaseWithoutCast
import org.mofgen.mGLang.PatternIfElseSwitch
import org.mofgen.mGLang.PatternNodeReference
import org.mofgen.mGLang.PatternReturn
import org.mofgen.mGLang.PatternSwitchCase
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.util.MofgenUtil
import org.mofgen.util.NameProvider
import org.mofgen.mGLang.ParamManipulation

class PatternTranslator {

	static def dispatch String translate(Pattern pattern) {

		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
		val paramManipulations = EcoreUtil2.getAllContentsOfType(pattern, ParamManipulation)

		val patternParameterTypes = newLinkedHashMap();
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

		val sequencer = new PatternBuildSequencer(nodes, paramManipulations)

		return '''
		«getPatternDoc(pattern)»
		«getPatternSignature(pattern)»
			
			«FOR node : nodes SEPARATOR ';' AFTER ';'»
				«node.type.name» «node.name»
			«ENDFOR»
			
			public «NameProvider.getPatternClassName(pattern)»(«IF !pattern.parameters.empty»«FOR entry : patternParameterTypes.entrySet SEPARATOR ','»«entry.value» «entry.key.name»
			«ENDFOR»«ENDIF»){
				«sequencer.getOrderedTranslation()»
			}
				
			«PatternTranslator.createGetters(pattern)»
		}'''
	}

	private static def getPatternDoc(Pattern pattern) {
		return '''/**
			* The pattern «NameProvider.getPatternClassName(pattern)».
			*/
		'''
	}

	private static def getPatternSignature(Pattern pattern) {
		return '''
			public class «NameProvider.getPatternClassName(pattern)» extends «JavaFileGenerator.PATTERN_SUPER_CLASS»{
		'''
	}

	static def dispatch String translate(PatternNodeReference ref) {
		val node = EcoreUtil2.getContainerOfType(ref, Node)
		var trgName = ""
		if (node !== null) {
			trgName = node.name
		} else {
			val manip = EcoreUtil2.getContainerOfType(ref, ParamManipulation)
			trgName = manip.param.name
		}
		if (ref.type.upperBound < 1) {
			return '''
				«trgName».«NameProvider.getGetterName(ref.type)»().add(«ref.target.name»);
			'''
		} else {
			return '''
				«trgName».«NameProvider.getSetterName(ref.type)»(«ref.target.name»);
			'''
		}

	}

	static def dispatch String translate(NodeAttributeAssignment ass) {
		val node = EcoreUtil2.getContainerOfType(ass, Node)
		return '''
			«node.name».«NameProvider.getSetterName(ass.target)»(«MofgenUtil.resolveArithmeticExpression(ass.value)»);
		'''
	}

	static def dispatch String translate(PatternCall pc) {
		return '''
			(new «NameProvider.getPatternClassName(pc.called)»().createInstance(«IF pc.params.params.empty»);«ELSE»«FOR param : pc.params.params SEPARATOR ',' AFTER ')'» «MofgenUtil.getTextFromEditorFile(param)»«ENDFOR»«ENDIF»)
		'''
	}

	static def dispatch String translate(PatternReturn pReturn) {
		if (pReturn.returnValue !== null) {
			return '''return «pReturn.returnValue.name»;'''
		} else {
			// TODO return Pattern as a whole?
		}
	}

	private static def createGetters(Pattern pattern) {
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

	static def dispatch String translate(PatternIfElseSwitch pSwitch) {
		return '''
			«FOR caze : pSwitch.cases SEPARATOR 'else'»
				if(«MofgenUtil.getTextFromEditorFile(caze.when)»){
					«FOR refAssign : caze.body.expressions SEPARATOR ';'AFTER';'»
						«translate(refAssign)»
					«ENDFOR»
				}
			«ENDFOR»
			«IF pSwitch.^default !== null»
				else{
					«FOR refAssign : (pSwitch.^default as PatternCaseBody).expressions SEPARATOR';'AFTER';'»
						«translate(refAssign)»
					«ENDFOR»
				}
			«ENDIF»
		'''
	}

	static def dispatch String translate(PatternSwitchCase zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
				«IF caze instanceof PatternCaseWithCast»
					if(«zwitch.attribute» instanceof «caze.node.type.instanceTypeName»){
						«caze.node.type.instanceTypeName»«caze.node.name» = («caze.node.type.instanceTypeName»)«zwitch.attribute»
						«IF caze.when !== null»
							if(«MofgenUtil.getTextFromEditorFile(caze.when)»){
						«ENDIF»
						«FOR bodyExpr : caze.body.expressions SEPARATOR';'AFTER';'»
							«translate(bodyExpr)»
						«ENDFOR»
						«IF caze.when !== null»
							}
						«ENDIF»
					}
				«ENDIF»
				«IF caze instanceof PatternCaseWithoutCast»
					if(«MofgenUtil.resolveRefOrCall(zwitch.attribute)»  == «MofgenUtil.getTextFromEditorFile(caze.^val)»){
						«FOR bodyExpr : caze.body.expressions SEPARATOR';'AFTER';'»
							«translate(bodyExpr)»
						«ENDFOR»
					}
				«ENDIF»
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
					«FOR expression : (zwitch.^default as PatternCaseBody).expressions SEPARATOR';'AFTER';'»
						«translate(expression)»
					«ENDFOR»
				}
			«ENDIF»
		'''
	}

}
