package org.mofgen.util

import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.Parameter
import org.mofgen.mGLang.Pattern

class NameProvider {
	
	final static String PARAMETER_SUFFIX = "Parameter"
	
	/**
	 * Returns the java class name for the given pattern
	 */
	def static String getPatternClassName(Pattern pattern) {
		return getPatternClassName(pattern.getName());
	}

	/**
	 * Returns the java class name for the given pattern name.
	 */
	def static String getPatternClassName(String patternName) {
		return patternName.toFirstUpper + "Pattern";
	}

	/**
	 * Returns the method name for the given name with the given prefix.
	 */
	def static String getMethodName(String prefix, String name) {
		return prefix + name.toFirstUpper
	}

	/**
	 * Returns the java class name for the given generator
	 */
	def static String getGeneratorClassName(Generator gen) {
		return gen.name.toFirstUpper + "Generator";
	}

	def static String getAppClassName(IFile mofgenFile) {
		return NameProvider.getFileName(mofgenFile).toFirstUpper + "App"
	}
	
	def static String getFileName(String fileString){
		return fileString.split("\\.").get(0)
	}
	
	def static String getFileName(IFile file){
		return file.name.split("\\.").get(0)
	}
	
	/**
	 * @return the literal expression to access the given eClass in its Package
	 */
	def static String getLiteralName(EClass clazz){
		// split camelCase
		val splitName = clazz.name.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")
		return '''
		«FOR nameSegment : splitName SEPARATOR '_'»«nameSegment.toUpperCase»«ENDFOR»
		'''
	}

	/**
	 * @return the Name of the setter method for the given EReference
	 */
	def static String getSetterName(EReference ref) {
		return 'set' + ref.name.toFirstUpper
	} // TODO Not needed since EReference also is a subclass of ENamedElement?

	/**
	 * @return the Name of the setter method for the given ENamedElement
	 */
	def static String getSetterName(ENamedElement namedElement) {
		return 'set' + namedElement.name.toFirstUpper
	}

	/**
	 * @return the Name of the getter method for the given ENamedElement
	 */
	def static String getGetterName(ENamedElement namedElement) {
		if (namedElement instanceof EEnum) {
			return namedElement.name
		}
		if (namedElement instanceof EEnumLiteral) {
			return namedElement.name.toUpperCase
		}
		if (namedElement.name == "keys") {
			return 'keySet'
		}
		if (namedElement.name == "values") {
			return 'values'
		}
		return getGetterName(namedElement.name)
	}
	
	def static String getGetterName(Node node){
		return getGetterName(node.name)
	}
	
	def static String getGetterName(Parameter param){
		return getGetterName(NameProvider.getParameterName(param));
	}
	
	private def static String getGetterName(String str){
		return 'get'+str.toFirstUpper
	}

	def static String getPatternCreate(Pattern pattern) {
		return '''«getPatternClassName(pattern)».create'''
	}

	/**
	 * @return the class name as prefix for automatically generated API files
	 */
	def static String getClassNamePrefix(IFile file) {
		val split = file.name.split('\\.')
		return split.get(0).toFirstUpper
	}

	def static String getFactoryClassName(EPackage ePackage) {
		return ePackage.name.toFirstUpper + "Factory"
	}

	def static String getPackageClassName(EPackage ePackage) {
		return ePackage.name.toFirstUpper + "Package"
	}

	def static String locationToPackageName(String location) {
		return location.replace('/', '.').replace('\\', '.')
	}
	
	def static String getParameterName(Parameter param){
		return param.name+PARAMETER_SUFFIX
	}
	
	def static String getParameterName(String str){
		return str+PARAMETER_SUFFIX
	}
}
