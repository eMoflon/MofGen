package org.mofgen.build

import java.util.List
import java.util.Queue
import java.util.Set
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NodeAttributeAssignment
import org.mofgen.mGLang.NodeContent
import org.mofgen.mGLang.ParamManipulation
import org.mofgen.mGLang.Parameter
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.PatternForStatement
import org.mofgen.mGLang.PatternIfElseSwitch
import org.mofgen.mGLang.PatternNodeReference
import org.mofgen.mGLang.PatternNodeReferenceToNode
import org.mofgen.mGLang.PatternSwitchCase
import org.mofgen.mGLang.RefOrCall

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

	new(List<Node> nodes, List<ParamManipulation> paramManipulations) {
		validElements = newHashSet()
		remainingElements = newLinkedList()
		srcCodeElements = newLinkedList()
		for (paramManipulation : paramManipulations) {
			remainingElements.addAll(paramManipulation.content.refsAssigns)
		}
		createNodes(nodes)
	}

	/**
	 * @return the source code as string in an order for safe execution, i.e. no compiler or NP-exceptions
	 */
	def getOrderedTranslation() {
		var cnt = 0
		while (!remainingElements.empty) {
			val elem = remainingElements.remove()
			if (checkCoherency(elem)) {
				val translation = PatternTranslator.translate(elem)
				srcCodeElements.add(translation)
				makeTranslatedElementValid(elem)
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
	private def makeTranslatedElementValid(EObject elem) {
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
				return true;
			} else if (roc.ref instanceof Parameter) {
				return true;
			} else {
				throw new IllegalStateException(
					"In patterns should only occur direct references to nodes but got unexpected reference to " +
						roc.ref)
			}
		} else {
			if(roc.ref instanceof EEnumLiteral){
				return true;
			}
			return validElements.contains(getValidName(roc)) // TODO only when ref is from a newly created node. not necessarily at objects passed as parameters!
		}
	}

	private def dispatch boolean internalCoherencyCheck(PatternNodeReferenceToNode pNodeRef) {
		return validElements.contains(getValidName(pNodeRef.node))
	}

	private def dispatch boolean internalCoherencyCheck(PatternIfElseSwitch zwitch) {
		val switchExpressions = newLinkedList()
		for (caze : zwitch.cases) {
			switchExpressions.addAll(caze.body.expressions)
			switchExpressions.add(caze.when)
		}
		switchExpressions.addAll(zwitch.^default.expressions)

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
		switchExpressions.addAll(zwitch.^default.expressions)
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
			PatternNodeReference: {
				val node = EcoreUtil2.getContainerOfType(elem, Node)
				if (node !== null) {
					return node.name + '_' + elem.type.name
				} else {
					val manip = EcoreUtil2.getContainerOfType(elem, ParamManipulation)
					return manip.param.name + "_" + elem.type.name
				}
			}
			Node:
				return elem.name
			RefOrCall: {
				var name = ""
				if (elem.target !== null) {
					return getValidName(elem.target) + '_' + getNameForRocRef(elem.ref)
				} else {
					val ref = elem.ref
					switch ref {
						ENamedElement: return ref.name
						Node: return ref.name
					}
				}
				return name
			}
		}
	}

	private def String getNameForRocRef(EObject ref) {
		switch ref {
			ENamedElement: return ref.name
			Node: return ref.name
		}
	}

	/**
	 * creates/translated all nodes and then adds all sub-expressions within the node-objects to the elementsLeft list. 
	 */
	private def createNodes(List<Node> nodes) {
		for (node : nodes) {
			val createdBy = node.createdBy
			if (createdBy !== null) {
				if (createdBy instanceof NodeContent) {
					srcCodeElements.add(PatternTranslator.translate(node))
					validElements.add(getValidName(node))
					remainingElements.addAll(createdBy.refsAssigns)
				} else if (createdBy instanceof PatternCall) {
					remainingElements.add(node)
				} else {
					throw new IllegalArgumentException(
						"Given node " + node.name + " is neither created by plain assignments, nor by a pattern call.")
				}
			} else {
				srcCodeElements.add(PatternTranslator.translate(node))
				validElements.add(getValidName(node))
			}
		}
	}
}
