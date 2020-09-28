package org.mofgen.util

import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.Pattern
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.core.resources.IFile

class NameProvider {
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
	 * Returns the getter method name for the given name.
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

	/**
	 * @return the Name of the setter method for the given EReference
	 */
	def static String getSetterName(EReference ref){
		return 'set'+ref.name.toFirstUpper
	} //TODO Not needed since EReference also is a subclass of ENamedElement?
	
	/**
	 * @return the Name of the setter method for the given ENamedElement
	 */
	def static String getSetterName(ENamedElement namedElement){
		return 'set'+namedElement.name.toFirstUpper
	}
	
	/**
	 * @return the Name of the getter method for the given ENamedElement
	 */
	def static String getGetterName(ENamedElement namedElement){
		return 'get'+namedElement.name.toFirstUpper
	}
	
	def static String getPatternCreate(Pattern pattern){
		return '''«getPatternClassName(pattern)».create'''
	}
	
	/**
	 * @return the class name as prefix for automatically generated API files
	 */
	def static String getClassNamePrefix(IFile file){
		return file.name.toFirstUpper
	}
	
	def static String locationToPackageName(String location){
		return location.replace('/', '.').replace('\\', '.');
	}
}
