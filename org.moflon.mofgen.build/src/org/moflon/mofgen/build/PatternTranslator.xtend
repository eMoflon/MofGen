package org.moflon.mofgen.build

import java.util.Map
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.EcoreUtil2
import org.moflon.mofgen.lang.mofgenLanguage.Node
import org.moflon.mofgen.lang.mofgenLanguage.NodeAttributeAssignment
import org.moflon.mofgen.lang.mofgenLanguage.NodeContent
import org.moflon.mofgen.lang.mofgenLanguage.ParamManipulation
import org.moflon.mofgen.lang.mofgenLanguage.Parameter
import org.moflon.mofgen.lang.mofgenLanguage.ParameterNodeOrPattern
import org.moflon.mofgen.lang.mofgenLanguage.Pattern
import org.moflon.mofgen.lang.mofgenLanguage.PatternCall
import org.moflon.mofgen.lang.mofgenLanguage.PatternCaseBody
import org.moflon.mofgen.lang.mofgenLanguage.PatternCaseWithCast
import org.moflon.mofgen.lang.mofgenLanguage.PatternCaseWithoutCast
import org.moflon.mofgen.lang.mofgenLanguage.PatternForStatement
import org.moflon.mofgen.lang.mofgenLanguage.PatternIfElseSwitch
import org.moflon.mofgen.lang.mofgenLanguage.PatternNodeReferenceToNode
import org.moflon.mofgen.lang.mofgenLanguage.PatternNodeReferenceToPatternCall
import org.moflon.mofgen.lang.mofgenLanguage.PatternReturn
import org.moflon.mofgen.lang.mofgenLanguage.PatternSwitchCase
import org.moflon.mofgen.lang.mofgenLanguage.PrimitiveParameter
import org.moflon.mofgen.build.util.NameProvider
import org.moflon.mofgen.build.util.MofgenUtil

class PatternTranslator {

	static def String translate(EObject obj) {
		return internalTranslate(obj)
	}

		
	private static def getToStringMethod(Pattern pattern){
		return
		'''
		public String toString(){
			return "Pattern «pattern.name»"
			+"\nNodes: «EcoreUtil2.getAllContentsOfType(pattern, Node).toString»"
			+"\nParameters: «pattern.parameters.toString»"
			;
		}
		
		'''
	}

	private static def dispatch String internalTranslate(Pattern pattern) {

		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
		val patternParameterTypes = newLinkedHashMap();
		if (!pattern.parameters.empty) {
			for (parameter : pattern.parameters) {
				if (parameter instanceof PrimitiveParameter) {
					patternParameterTypes.put(parameter, parameter.type.literal)
				} else if (parameter instanceof ParameterNodeOrPattern) {
					val type = parameter.type
					if (type instanceof EClassifier) {
						if (type == EcorePackage.Literals.ESTRING) {
							patternParameterTypes.put(parameter, "String")
						} else {
							patternParameterTypes.put(parameter, type.name)
						}
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

		val sequencer = new PatternBuildSequencer(pattern)

		return '''
		«getPatternDoc(pattern)»
		«getPatternSignature(pattern)»
			
			// create data fields for actual nodes
			«FOR node : nodes.filter[n|n.eContainer instanceof Pattern]»
				private «node.type.name» «node.name»;
			«ENDFOR»
			
			// create data fields for parameter nodes
			«IF !pattern.parameters.empty»
				«FOR parameter : pattern.parameters»
					private «patternParameterTypes.get(parameter)» «NameProvider.getParameterName(parameter)»;
				«ENDFOR»
			«ENDIF»
			
			public «NameProvider.getPatternClassName(pattern)»(«IF !pattern.parameters.empty»«FOR entry : patternParameterTypes.entrySet SEPARATOR ','»«entry.value» «entry.key.name»
			«ENDFOR»«ENDIF»){
				«sequencer.getOrderedTranslation()»
			}
				
			«PatternTranslator.createGetters(pattern)»
			«PatternTranslator.createParameterGetters(patternParameterTypes)»
			«PatternTranslator.getToStringMethod(pattern)»
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

	private static def dispatch String internalTranslate(PatternNodeReferenceToNode ref) {
		val srcNode = EcoreUtil2.getContainerOfType(ref, Node)
		var nodeName = ""
		if (srcNode !== null) {
			nodeName = srcNode.name
		} else {
			val manip = EcoreUtil2.getContainerOfType(ref, ParamManipulation)
			nodeName = manip.param.name
		}

		if (ref.type.upperBound < 0) {
			return '''
				«nodeName».«NameProvider.getGetterName(ref.type)»().add(«translate(ref.node)»)
			''' 
		} else {
			return '''
				«nodeName».«NameProvider.getSetterName(ref.type)»(«translate(ref.node)»)
			'''
		}
	}

	private static def dispatch String internalTranslate(Node node) {
		val eClassifier = node.type
		val ePackage = MofgenUtil.getEPackage(eClassifier)
		val createdBy = node.createdBy 
		if (createdBy === null) {
			return '''this.«node.name» = («eClassifier.name») «NameProvider.getFactoryClassName(ePackage)».eINSTANCE.create(«NameProvider.getPackageClassName(ePackage)».Literals.«NameProvider.getLiteralName(eClassifier)»)'''
		}
		if (createdBy instanceof NodeContent) {
			return '''this.«node.name» = («eClassifier.name») «NameProvider.getFactoryClassName(ePackage)».eINSTANCE.create(«NameProvider.getPackageClassName(ePackage)».Literals.«NameProvider.getLiteralName(eClassifier)»)'''
		} else if (createdBy instanceof PatternCall) {
			return '''this.«node.name» = «translate(createdBy)»'''
		} else {
			throw new IllegalStateException("Nodes should only be created by NodeContent or a pattern call")
		}
	}

	private static def dispatch String internalTranslate(PatternNodeReferenceToPatternCall ref) {
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
				«nodeName».«NameProvider.getGetterName(ref.type)»().add(«translate(ref.pc)»)
			'''
		} else {
			return '''
				«nodeName».«NameProvider.getSetterName(ref.type)»(«translate(ref.pc)»)
			'''
		}
	}

	private static def dispatch String internalTranslate(NodeAttributeAssignment ass) {
		val node = EcoreUtil2.getContainerOfType(ass, Node)
		return '''
			this.«node.name».«NameProvider.getSetterName(ass.target)»(«translate(ass.value)»)
		'''
	}

	private static def dispatch String internalTranslate(PatternReturn pReturn) {
		if (pReturn.retValue !== null) {
			return '''return «GeneralTranslator.translate(pReturn.retValue)»'''

//			val retValue = pReturn.retValue.ref
//			if (retValue instanceof Node) {
//				return '''return «retValue.name»'''
//			}
//			if (retValue instanceof Parameter) {
//				return '''return «NameProvider.getParameterName(retValue)»'''
//			}
		}
	}

	private static def dispatch String internalTranslate(PatternForStatement patternFor) {
		val head = patternFor.head
		val headSrc = translate(head)

		return '''for(«headSrc»){
		«FOR bodyExpr : patternFor.body.commands» 
			«translate(bodyExpr)»;
		«ENDFOR»
		}'''
	}

	private static def createGetters(Pattern pattern) {
		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node).filter[n|n.eContainer instanceof Pattern]
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
	
	private static def createParameterGetters(Map<Parameter, String> pMap){
		return '''
			
			«FOR parameter : pMap.keySet»
				/**
				* @return the parameter «parameter.name» attribute of type «pMap.get(parameter)»
				*/
				public «pMap.get(parameter)» «MofgenUtil.getGetterMethod(parameter)»{
					return «NameProvider.getParameterName(parameter)»;
				}
				
			«ENDFOR»
		'''
		
	}

	private static def dispatch String internalTranslate(PatternIfElseSwitch pSwitch) {
		return '''
			«FOR caze : pSwitch.cases SEPARATOR 'else'»
				if(«translate(caze.when)»){
					«FOR refAssign : caze.body.expressions»
						«translate(refAssign)»;
					«ENDFOR»
				}
			«ENDFOR»
			«IF pSwitch.^default !== null»
				else{
					«FOR refAssign : (pSwitch.^default.body as PatternCaseBody).expressions»
						«translate(refAssign)»;
					«ENDFOR»
				}
			«ENDIF»
		'''
	}

	private static def dispatch String internalTranslate(PatternSwitchCase zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
				«IF caze instanceof PatternCaseWithCast»
					if(«translate(zwitch.attribute)» instanceof «caze.node.type.name»){
						«caze.node.type.name» «caze.node.name» = («caze.node.type.name») «translate(zwitch.attribute)»;
						«IF caze.when !== null»
							if(«translate(caze.when)»){
						«ENDIF»
						«FOR bodyExpr : caze.body.expressions»
							«translate(bodyExpr)»;
						«ENDFOR»
						«IF caze.when !== null»
							}
						«ENDIF»
					}
				«ENDIF»
				«IF caze instanceof PatternCaseWithoutCast»
					if(«translate(zwitch.attribute)»  == «translate(caze.^val)»){
						«FOR bodyExpr : caze.body.expressions»
							«translate(bodyExpr)»;
						«ENDFOR»
					}
				«ENDIF»
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
					«FOR expression : (zwitch.^default.body as PatternCaseBody).expressions»
						«translate(expression)»;
					«ENDFOR»
				}
			«ENDIF»
		'''
	}

	// all objects that have to be translated but are not exclusive to patterns are forwarded to the general translator
	private static def dispatch String internalTranslate(EObject obj) {
		return GeneralTranslator.translate(obj)
	}

}
