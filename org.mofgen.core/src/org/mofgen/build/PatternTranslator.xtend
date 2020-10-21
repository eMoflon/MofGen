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
import org.mofgen.mGLang.PatternNodeReferenceToNode
import org.mofgen.mGLang.PatternNodeReferenceToPatternCall
import org.mofgen.mGLang.PatternForStatement
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.NodeContent

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

	static def dispatch String translate(PatternNodeReferenceToNode ref) {
		val node = EcoreUtil2.getContainerOfType(ref, Node)
		var nodeName = ""
		if (node !== null) {
			nodeName = node.name
		} else {
			val manip = EcoreUtil2.getContainerOfType(ref, ParamManipulation)
			nodeName = manip.param.name
		}

		if (ref.type.upperBound < 1) {
			return '''
				«nodeName».«NameProvider.getGetterName(ref.type)»().add(«ref.node.name»);
			'''
		} else {
			return '''
				«nodeName».«NameProvider.getSetterName(ref.type)»(«ref.node.name»);
			'''
		}
	}

	static def dispatch String translate(Node node) {
		val eClass = node.type
		val ePackage = MofgenUtil.getEPackage(eClass)
		val createdBy = node.createdBy
		if(createdBy === null){
			return '''«node.name» = («eClass.name») «NameProvider.getFactoryClassName(ePackage)».eINSTANCE.create(«NameProvider.getPackageClassName(ePackage)».Literals.«NameProvider.getLiteralName(eClass)»);'''
		}
		if (createdBy instanceof NodeContent) {
			return '''«node.name» = («eClass.name») «NameProvider.getFactoryClassName(ePackage)».eINSTANCE.create(«NameProvider.getPackageClassName(ePackage)».Literals.«NameProvider.getLiteralName(eClass)»);'''
		} else if (createdBy instanceof PatternCall) {
			return '''«node.name» = «GeneralTranslator.translatePatternCall(createdBy)»'''
		} else {
			throw new IllegalStateException("Nodes should only be created by NodeContent or a pattern call")
		}
	}

	static def dispatch String translate(PatternNodeReferenceToPatternCall ref) {
		val node = EcoreUtil2.getContainerOfType(ref, Node)
		var nodeName = ""
		if (node !== null) {
			nodeName = node.name
		} else {
			val manip = EcoreUtil2.getContainerOfType(ref, ParamManipulation)
			nodeName = manip.param.name
		}

		if (ref.type.upperBound < 1) {
			return '''
				«nodeName».«NameProvider.getGetterName(ref.type)»().add(«translate(ref.pc)»);
			'''
		} else {
			return '''
				«nodeName».«NameProvider.getSetterName(ref.type)»(«translate(ref.pc)»);
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
		return GeneralTranslator.translatePatternCall(pc)
	}

	static def dispatch String translate(PatternReturn pReturn) {
		if (pReturn.returnValue !== null) {
			return '''return «pReturn.returnValue.name»;'''
		} else {
			// TODO return Pattern as a whole?
		}
	}

	static def dispatch String translate(PatternForStatement patternFor) {
		val head = patternFor.head
		val headSrc = GeneralTranslator.translateForHead(head)

		return '''for(«headSrc»){
		«FOR bodyExpr : patternFor.body.commands» 
			«translate(bodyExpr)»
		«ENDFOR»
		}'''
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
