package org.moflon.mofgen.generator;

import org.eclipse.core.resources.IProject;

public interface MofgenBuilderExtension {
	static final String BUILDER_EXTENSON_ID = "mofgen.MofgenBuilderExtension";
	
	/**
	 * Builds the project.
	 * 
	 * @param project
	 *            the project to build
	 */
	public void run(IProject project);

}
