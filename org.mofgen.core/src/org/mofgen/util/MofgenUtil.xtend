package org.mofgen.util

import java.io.IOException
import java.util.Map
import java.util.Optional
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.mofgen.build.MofgenBuilder
import org.mofgen.interpreter.TypeRegistry
import org.mofgen.mGLang.List
import org.mofgen.mGLang.Node

class MofgenUtil {

	def static String getTextFromEditorFile(EObject obj) {
		return NodeModelUtils.getTokenText(NodeModelUtils.getNode(obj))
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

	def static getListType(List list) {
		TypeRegistry.getListType(list)
	}

	def static getMapKeyType(org.mofgen.mGLang.Map map) {
		TypeRegistry.getMapKeyType(map)
	}

	def static getMapEntryType(org.mofgen.mGLang.Map map) {
		TypeRegistry.getMapEntryType(map)
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
