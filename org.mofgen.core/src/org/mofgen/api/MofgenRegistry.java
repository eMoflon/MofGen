package org.mofgen.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.mofgen.mGLang.Variable;
import org.mofgen.util.RuntimeCalculator;

/**
 * A super class for registries storing all variable, object and collection values/data fields.
 * @author Tobias Niehues
 *
 */
public abstract class MofgenRegistry {

	// TODO Maybe this whole class is not needed
	
	private static Map<Variable, Object> vars = new HashMap<>();
	private static Map<org.mofgen.mGLang.Collection, Collection> colls = new HashMap<>();
	private static Map<Object, EObject> nodes = new HashMap<>();
	
	/**
	 * @param var - the variable used as key for the registry map
	 * @return the current value for the given Variable
	 */
	public Object getVar(Variable var) {
		return vars.get(var);
	}
	
	public Object putVar(Variable var) {
		return vars.put(var, RuntimeCalculator.evaluate(var.getValue()));
	}
}
