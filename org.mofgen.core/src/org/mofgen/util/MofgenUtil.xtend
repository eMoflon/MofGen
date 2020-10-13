package org.mofgen.util

import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.emf.ecore.EObject
import org.mofgen.mGLang.RefOrCall
import org.eclipse.emf.ecore.ENamedElement
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.Variable
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.mofgen.build.MofgenBuilder
import org.mofgen.mGLang.Import
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import java.util.Optional
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.IOException
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.Literal
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.UnaryMinus
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.Tertiary
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.Primary
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EEnum
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.PrimitiveParameter

class MofgenUtil {

	def static String getTextFromEditorFile(EObject obj) {
		return NodeModelUtils.getTokenText(NodeModelUtils.getNode(obj))
	}

	def static String resolveArithmeticExpression(ArithmeticExpression ae) {
		switch ae {
			RefOrCall:
				return resolveRefOrCall(ae)
			Literal:
				return getTextFromEditorFile(ae)
			PatternCall:
				return '''«NameProvider.getPatternClassName(ae.called)».createInstance(«/*TODO call parameters*/»)'''
			UnaryMinus:
				return '''-«resolveArithmeticExpression(ae.expr)»'''
			FunctionCall: {
				switch ae.func {
					case SQRT: return '''Math.sqrt(«resolveArithmeticExpression(ae.expr)»'''
					case ABS: return '''Math.abs(«resolveArithmeticExpression(ae.expr)»'''
				}
			}
			NegationExpression:
				return '''!«resolveArithmeticExpression(ae.expr)»'''
			Rel:
				return '''«resolveArithmeticExpression(ae.left)»«ae.relation.literal»«resolveArithmeticExpression(ae.right)»'''
			Primary:
				return '''«resolveArithmeticExpression(ae.left)»«ae.op.literal»«resolveArithmeticExpression(ae.right)»'''
			Secondary:
				return '''«resolveArithmeticExpression(ae.left)»«ae.op.literal»«resolveArithmeticExpression(ae.right)»'''
			Tertiary:
				return '''«resolveArithmeticExpression(ae.left)»«ae.op.literal»«resolveArithmeticExpression(ae.right)»'''
			default:
				return getTextFromEditorFile(ae)
		}
	}

	/**
	 * Scans all EPackages known by the build process for the given class
	 * @param eClass the eClass whose package should be retrieved
	 * @return the corresponding EPackage
	 */
	def static EPackage getEPackage(EClass eClass) {
		for (Object obj : MofgenBuilder.packageRegistry.values) {
			val ePackage = obj as EPackage
			if (ePackage.EClassifiers.contains(eClass)) {
				return ePackage
			}
		}
		return null;
	}

	/**
	 * Returns the EPackage to the corresponding uri
	 * @param uriString the uri given as string
	 * @return the EPackage
	 */
	def static EPackage getEPackage(String uriString) {
		var opt = loadEcoreModel(uriString)
		if (opt.isPresent) {
			return getEPackageFromResource(opt.get);
		} else {
			return null;
		}
	}

	/**
	 * Extracts an EPackage from a given resource.
	 */
	def static EPackage getEPackageFromResource(Resource res) {
		return res.contents.get(0) as EPackage
	}

	/**
	 * @return a source code string for the creation of a given eClass.
	 */
	def static String getCreationOfEObject(EClass eClass) {
		val ePackage = getEPackage(eClass)
		return '''(«eClass.name») «NameProvider.getFactoryClassName(ePackage)».eINSTANCE.create(«NameProvider.getPackageClassName(ePackage)».Literals.«eClass.name.toUpperCase»)'''
	}

	/**
	 * Translates References or calls to source code for the auto-generated classes.
	 * @param roc the RefOrCall object
	 * @return the source code as string
	 */
	def static String resolveRefOrCall(RefOrCall roc) {
		val ref = roc.ref
		switch ref {
			ENamedElement: {
				var prefix = ""
				var suffix = "()"
				if (roc.target !== null) {
					prefix = '''«resolveRefOrCall(roc.target)».'''
				}
				if (roc.ref instanceof EEnum || roc.ref instanceof EEnumLiteral) {
					suffix = ""
				}
				return '''«prefix»«NameProvider.getGetterName(ref)»«suffix»'''
			}
			Node: {
				if (roc.target !== null) {
					return '''«resolveRefOrCall(roc.target)».«ref.name»'''
				} else {
					return ref.name
				}
			}
			Variable: {
				if (roc.target !== null) {
					return '''«resolveRefOrCall(roc.target)».«ref.name»'''
				} else {
					return ref.name
				}
			}
			Import: {
				return getEPackage(ref.uri).name
			}
			ParameterNodeOrPattern: {
				return ref.name
			}
			PrimitiveParameter: {
				return ref.name
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

	/**
	 * The set of meta-model resources loaded.
	 */
	static Map<URI, Resource> metaModelResources = newHashMap();

	/**
	 * The resource set used for loading the meta-model resources.
	 */
	static final ResourceSetImpl resourceSet = new ResourceSetImpl();

	/**
	 * Returns an Optional for the Ecore model resource with the given URI.
	 * 
	 * @param uriString the URI of the resource to load
	 */
	def static loadEcoreModel(String uriString) {
		val uri = URI.createURI(uriString);
		try {
			val resource = new ResourceSetImpl().getResource(uri, true);
			resource.load(null);

			// Early return if the resource does not exist or is empty.
			if (resource.getContents().isEmpty()) {
				removeResource(uri);
				return Optional.empty();
			}

			// Add/update resource if necessary.
			if (!metaModelResources.containsKey(uri) ||
				metaModelResources.get(uri).getTimeStamp() < resource.getTimeStamp()) {
				updateResource(uri);
			}
			return Optional.of(metaModelResources.get(uri));
		} catch (Exception e) {
			removeResource(uri);
			return Optional.empty();
		}
	}

	/**
	 * Updates the resource for the given URI in the resource set and the mapping
	 * between URIs and resources.
	 * 
	 * @param uri the URI to update
	 * @throws IOException if the resource cannot be loaded
	 */
	def static updateResource(URI uri) throws IOException {
		// Remove resource if it was loaded before -> force reload.
		removeResource(uri);

		val resource = resourceSet.getResource(uri, true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		metaModelResources.put(uri, resource);
	}

	/**
	 * Removes the resource for the given URI from the resource set and the mapping
	 * between URIs and resources.
	 * 
	 * @param uri the URI to remove
	 * @return an empty optional
	 */
	def static removeResource(URI uri) {
		if (metaModelResources.containsKey(uri)) {
			val resource = metaModelResources.get(uri);
			resource.unload();
			resourceSet.getResources().remove(resource);
			metaModelResources.remove(uri);
		}
	}
	
	def static getGetterMethod(Node node){
		return '''get«node.name.toFirstUpper»()'''
	}

}
