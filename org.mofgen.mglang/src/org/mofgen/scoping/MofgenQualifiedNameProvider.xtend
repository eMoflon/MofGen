package org.mofgen.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.mofgen.mGLang.ForStatement
import org.mofgen.mGLang.GenCase
import org.mofgen.mGLang.GenCaseWithCast
import org.mofgen.mGLang.GenSwitchCase
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.IteratorVariable
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.Parameter
import org.mofgen.mGLang.Pattern
import org.mofgen.mGLang.PatternCase
import org.mofgen.mGLang.PatternSwitchCase
import org.mofgen.mGLang.PatternCaseWithCast

class MofgenQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	public final static String SWITCH_PREFIX = "!switch"
	public final static String CASE__PREFIX = "!case"
	public final static String FOR_PREFIX = "!for"
	public final static String PARAMETER_SUFFIX = "_parameter"

	override QualifiedName computeFullyQualifiedNameFromNameAttribute(EObject obj) {
		return computeFullyQualifiedNameInternal(obj);
	}

	def dispatch QualifiedName computeFullyQualifiedNameInternal(IteratorVariable itVar) {
		val qualifiedNameSegments = newLinkedList();
		qualifiedNameSegments.add(itVar.name);
		for (obj : EcoreUtil2.getAllContainers(itVar)) {
			var appString = null as String
			if (obj instanceof Pattern) {
				appString = super.getFullyQualifiedName(obj).toString(".")
			}
			if (obj instanceof Generator) {
				appString = super.getFullyQualifiedName(obj).toString(".")
			}
			if (obj instanceof ForStatement) {
				val lineNumber = NodeModelUtils.getNode(obj).getStartLine();
				appString = FOR_PREFIX + lineNumber
			}
			if(appString !== null){
				qualifiedNameSegments.add(0, appString);
			}
		}
		return QualifiedName.create(qualifiedNameSegments);
	}

	def dispatch QualifiedName computeFullyQualifiedNameInternal(Parameter obj) {
		return super.computeFullyQualifiedNameFromNameAttribute(obj).append("_parameter");
	}

	def dispatch QualifiedName computeFullyQualifiedNameInternal(Node node) {
		val qualifiedNameSegments = newLinkedList();
		qualifiedNameSegments.add(node.name);
		for (obj : EcoreUtil2.getAllContainers(node)) {
			var appString = null as String
			if (obj instanceof GenSwitchCase) {
				val lineNumber = NodeModelUtils.getNode(obj).getStartLine();
				appString = SWITCH_PREFIX + String.valueOf(lineNumber);
			}
			if (obj instanceof PatternSwitchCase) {
				val lineNumber = NodeModelUtils.getNode(obj).getStartLine();
				appString = SWITCH_PREFIX + String.valueOf(lineNumber);
			}
			if (obj instanceof GenCase) {
				val zwitch = EcoreUtil2.getContainerOfType(obj, GenSwitchCase);
				val cases = zwitch.getCases().filter(GenCaseWithCast).toList()
				appString = CASE__PREFIX + String.valueOf(cases.indexOf(obj));
			}
			if (obj instanceof PatternCase) {
				val zwitch = EcoreUtil2.getContainerOfType(obj, PatternSwitchCase);
				val cases = zwitch.getCases().filter(PatternCaseWithCast).toList()
				appString = CASE__PREFIX + String.valueOf(cases.indexOf(obj));
			}
			if (obj instanceof Pattern) {
				appString = super.getFullyQualifiedName(obj).toString(".")
			}
			if (obj instanceof Generator) {
				appString = super.getFullyQualifiedName(obj).toString(".")
			}
			if (appString !== null) {
				qualifiedNameSegments.add(0, appString)
			}
		}
		return QualifiedName.create(qualifiedNameSegments);
	}

	def dispatch QualifiedName computeFullyQualifiedNameInternal(EObject obj) {
		return super.computeFullyQualifiedNameFromNameAttribute(obj);
	}

}
