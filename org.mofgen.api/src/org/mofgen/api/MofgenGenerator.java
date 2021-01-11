package org.mofgen.api;

import org.eclipse.emf.ecore.EObject;

/**
 * This abstract class provides a superclass for all generator blocks specified in mofgen-files.
 * @author Tobias Niehues
 *
 */
public abstract class MofgenGenerator {

	protected String name;
	
	/**
	 * This method runs the specified generator.
	 * @return the eobject to save as resource
	 */
	public abstract EObject start();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.getName();
	}
	
}
