package org.mofgen.util

import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.emf.ecore.EObject
import org.mofgen.mGLang.RefOrCall
import org.eclipse.emf.ecore.ENamedElement
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.Variable

class MofgenUtil {

	def static String getTextFromEditorFile(EObject obj) {
		return NodeModelUtils.getTokenText(NodeModelUtils.getNode(obj))
	}

	def static String resolveRefOrCall(RefOrCall roc) {
		val ref = roc.ref
		switch ref {
			ENamedElement: {
				if (roc.target !== null) {
					return '''«resolveRefOrCall(roc.target)».«NameProvider.getGetterName(ref)»()'''
				} else {
					return NameProvider.getGetterName(ref)
				}
			}
			Node: {
				if (roc.target !== null) {
					return '''«resolveRefOrCall(roc.target)».«ref.name»'''
				} else {
					return ref.name
				}
			}
			Variable:{
				if (roc.target !== null) {
					return '''«resolveRefOrCall(roc.target)».«ref.name»'''
				} else {
					return ref.name
				}
			}
			default: {
				if (roc.target !== null) {
					return '''«resolveRefOrCall(roc.target)».«getTextFromEditorFile(ref)»'''
				} else {
					return getTextFromEditorFile(ref)
				}
			}
		}
	}

}
