package org.mofgen.util

import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.Pattern
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.ENamedElement

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

	def static String getSetterName(EReference ref){
		return 'set'+ref.name.toFirstUpper
	}
	
	def static String getSetterName(ENamedElement namedElement){
		return 'set'+namedElement.name.toFirstUpper
	}
}
