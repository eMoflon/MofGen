package org.mofgen.generator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;

public interface MofgenBuilderExtension {
	static final String BUILDER_EXTENSON_ID = "mofgen.MofgenBuilderExtension";
	
	/**
	 * Builds the project.
	 * 
	 * @param project
	 *            the project to build
	 */
	public void run(IProject project, Resource resource);

}
