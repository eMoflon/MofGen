package org.moflon.mofgen.build

import java.util.List
import java.util.Queue
import java.util.Set
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.moflon.mofgen.build.util.NameProvider
import org.moflon.mofgen.mGLang.ArithmeticExpression
import org.moflon.mofgen.mGLang.Node
import org.moflon.mofgen.mGLang.NodeAttributeAssignment
import org.moflon.mofgen.mGLang.NodeContent
import org.moflon.mofgen.mGLang.ParamManipulation
import org.moflon.mofgen.mGLang.Parameter
import org.moflon.mofgen.mGLang.ParameterNodeOrPattern
import org.moflon.mofgen.mGLang.Pattern
import org.moflon.mofgen.mGLang.PatternCall
import org.moflon.mofgen.mGLang.PatternCase
import org.moflon.mofgen.mGLang.PatternForStatement
import org.moflon.mofgen.mGLang.PatternIfElseSwitch
import org.moflon.mofgen.mGLang.PatternNodeReference
import org.moflon.mofgen.mGLang.PatternNodeReferenceToNode
import org.moflon.mofgen.mGLang.PatternNodeReferenceToPatternCall
import org.moflon.mofgen.mGLang.PatternSwitchCase
import org.moflon.mofgen.mGLang.RefOrCall

class PatternBuildSequencer {

	/**
	 * contains names by now valid to use nodes/eNamedElements. Should therefore only contain objects of class Node or ENamedElement. The names are created by the method getValidName()
	 */
	Set<String> validElements

	/**
	 * contains all already translated code segments
	 */
	List<String> srcCodeElements

	/**
	 * contains all elements that still need translation
	 */
	Queue<EObject> remainingElements

	new(Pattern pattern) {
		validElements = newHashSet()
		remainingElements = newLinkedList()
		srcCodeElements = newLinkedList()

		// filter if nodes are really child of pattern since node construct is also used in switches
		val allNodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
		val actualPatternNodes = allNodes.filter[n|n.eContainer instanceof Pattern].toList
		val caseNodes = allNodes.filter[n|n.eContainer instanceof PatternCase].toList

		for (caseNode : caseNodes) {
			makeElementValid(caseNode)
		}

		val paramManipulations = EcoreUtil2.getAllContentsOfType(pattern, ParamManipulation)
		val parameters = pattern.parameters

		for (paramManipulation : paramManipulations) {
			remainingElements.addAll(paramManipulation.content.refsAssigns)
		}
		translateParameterVariableAssigns(parameters)
		createNodes(actualPatternNodes)
	}

	/**
	 * Sets every parameter to a certain parameter variable within the pattern object.
	 */
	private def translateParameterVariableAssigns(List<Parameter> parameters) {
		for (param : parameters) {
			val srcCode = '''
				this.«NameProvider.getParameterName(param)» = «param.name»; 
			'''
			srcCodeElements.add(srcCode)
		}
	}

	/**
	 * @return the source code as string in an order for safe execution, i.e. no compiler or NP-exceptions
	 */
	def getOrderedTranslation() {
		var cnt = 0
		while (!remainingElements.empty) {
			val elem = remainingElements.remove()
			if (checkCoherency(elem)) {
				val translation = getTranslation(elem)
				srcCodeElements.add(translation)
				makeElementValid(elem)
				cnt = 0
			} else {
				remainingElements.add(elem)
				cnt++
				if (cnt > 100) {
					throw new UnsupportedOperationException("Some uncaught case probably resulted in an endless loop.")
				}
			}
		}

		return srcCodeElements.reduce[srcCode, elem|srcCode + elem]
	}

	/**
	 * If the given element is no control flow operation, marks the target of the given elements (either an attribute or a reference) as valid
	 */
	private def makeElementValid(EObject elem) {
		switch elem {
			NodeAttributeAssignment,
			Node,
			PatternNodeReference: validElements.add(getValidName(elem))
		}
	}

	/**
	 * Checks whether a given element can be translated without violating any attribute/reference accesses or similar.
	 * @return true, if the given element can be translated. false, otherwise.
	 */
	private def boolean checkCoherency(EObject obj) {
		return internalCoherencyCheck(obj)
	}

	private def dispatch boolean internalCoherencyCheck(Node node) {
		val createdBy = node.createdBy
		if (createdBy instanceof NodeContent) {
			throw new IllegalStateException(
				"All nodes created by plain NodeContent should have been instantiated initially and should therefore be valid")
		} else {
			val pc = createdBy as PatternCall
			return internalCoherencyCheck(pc)
		}
	}

	private def dispatch boolean internalCoherencyCheck(ParameterNodeOrPattern pNodeOrPattern) {
		return true // there is no possibility of cyclic dependencies when we are given a parameter
	}

	private def dispatch boolean internalCoherencyCheck(PatternCall pc) {
		for (param : pc.params.params) {
			if (!internalCoherencyCheck(param)) {
				return false
			}
		}
		return true
	}

	private def dispatch boolean internalCoherencyCheck(NodeAttributeAssignment ass) {
		return internalCoherencyCheck(ass.value)
	}

	private def dispatch internalCoherencyCheck(PatternForStatement patternFor) {
		return true;
	}

	private def dispatch boolean internalCoherencyCheck(ArithmeticExpression ae) {
		val refs = EcoreUtil2.getAllContentsOfType(ae, RefOrCall)
		val patternCalls = EcoreUtil2.getAllContentsOfType(ae, PatternCall)
		for (ref : refs) {
			if (!internalCoherencyCheck(ref)) {
				return false
			}
		}
		for (pc : patternCalls) {
			if (!internalCoherencyCheck(pc)) {
				return false
			}
		}
		return true
	}

	private def dispatch boolean internalCoherencyCheck(RefOrCall roc) {
		if (roc.target === null) {
			if (roc.ref instanceof Node) {
				return (roc.ref as Node).isValid;
			} else if (roc.ref instanceof Parameter) {
				return true;
			} else if (roc.thisUsed) {
				var parentRef = roc.eContainer()
				if (parentRef instanceof RefOrCall) {
					return internalCoherencyCheck(parentRef.ref)
				}
				return false
			} else {
				throw new IllegalStateException(
					"In patterns should only occur direct references to nodes but got unexpected reference to " +
						roc.ref)
			}
		} else {
			if (roc.ref instanceof EEnumLiteral) {
				return true;
			}
			if (roc.target.ref instanceof ParameterNodeOrPattern) {
				return true;
			}
			// return true if last target is Node in PatternCase
			var lastTarget = roc
			while(lastTarget.target !== null){
				lastTarget = lastTarget.target
			}
			if(lastTarget.ref instanceof Node && lastTarget.ref.eContainer instanceof PatternCase){
				return true;
			}

			return roc.isValid // only when ref is from a newly created node. not necessarily at objects passed as parameters!
		}
	}

	private def boolean isValid(EObject object) {
		return validElements.contains(getValidName(object))
	}

	private def dispatch boolean internalCoherencyCheck(PatternNodeReferenceToNode pNodeRef) {
		val node = pNodeRef.node
		if (node instanceof RefOrCall) {
			return checkCoherency(node)
		} else {
			throw new IllegalArgumentException("Cannot check coherency of object " + pNodeRef)
		}
	}

	private def dispatch boolean internalCoherencyCheck(PatternNodeReferenceToPatternCall pNodeRef) {
		val pc = pNodeRef.pc
		return internalCoherencyCheck(pc)
	}

	private def dispatch boolean internalCoherencyCheck(PatternIfElseSwitch zwitch) {
		val switchExpressions = newLinkedList()
		for (caze : zwitch.cases) {
			switchExpressions.addAll(caze.body.expressions)
			switchExpressions.add(caze.when)
		}
		val defaultObj = zwitch.^default
		if (defaultObj !== null) {
			switchExpressions.addAll(defaultObj.body.expressions)
		}

		for (expr : switchExpressions) {
			if (!internalCoherencyCheck(expr)) {
				return false;
			}
		}
		return true;
	}

	private def dispatch boolean internalCoherencyCheck(PatternSwitchCase zwitch) {
		val switchExpressions = newLinkedList()
		for (caze : zwitch.cases) {
			switchExpressions.addAll(caze.body.expressions)
		}
		val defaultObj = zwitch.^default
		if (defaultObj !== null) {
			switchExpressions.addAll(defaultObj.body.expressions)
		}
		switchExpressions.add(zwitch.attribute)

		for (expr : switchExpressions) {
			if (!internalCoherencyCheck(expr)) {
				return false;
			}
		}
		return true;
	}

	private def String getValidName(EObject elem) {
		switch elem {
			NodeAttributeAssignment: {
				val node = EcoreUtil2.getContainerOfType(elem, Node)
				return node.name + '_' + elem.target.name
			}
			PatternNodeReferenceToNode: {
				val node = EcoreUtil2.getContainerOfType(elem, Node)
				if (node !== null) {
					return node.name + '_' + elem.type.name
				} else {
					val manip = EcoreUtil2.getContainerOfType(elem, ParamManipulation)
					return manip.param.name + "_" + elem.type.name
				}
			}
			Node: {
				return elem.name
			}
			RefOrCall: {
				if (elem.target !== null) {
					if (elem.target.thisUsed) {
						return getValidName(elem.ref)
					} else {
						return getValidName(elem.target) + '_' + getValidName(elem.ref)
					}
				} else {
					return getValidName(elem.ref)
				}
			}
			ENamedElement:
				return elem.name
		}
	}

	/**
	 * creates/translates all nodes and then adds all sub-expressions within the node-objects to the elementsLeft list. 
	 */
	private def createNodes(List<Node> nodes) {
		for (node : nodes) {
			val createdBy = node.createdBy
			if (createdBy !== null) {
				if (createdBy instanceof NodeContent) {
					srcCodeElements.add(getTranslation(node))
					validElements.add(getValidName(node))
					remainingElements.addAll(createdBy.refsAssigns)
				} else if (createdBy instanceof PatternCall) {
					remainingElements.add(node)
				} else if(createdBy instanceof RefOrCall){
					throw new IllegalArgumentException(
						"Given node " + node.name + " is neither created by plain assignments, nor by a pattern call.")
				}
			} else {
				srcCodeElements.add(getTranslation(node))
				validElements.add(getValidName(node))
			}
		}
	}

	private def getTranslation(EObject obj) {
		return PatternTranslator.translate(obj) + ';'
	}
}
