package org.mofgen.validation;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;

public class MofgenNamesAreUniqueValidator extends NamesAreUniqueValidator {

	public void doCheckUniqueNames(Resource resource, CancelIndicator cancelIndicator) {
		setHelper(new MofgenNamesAreUniqueValidationHelper());
		final IResourceServiceProvider resourceServiceProvider = getResourceServiceProviderRegistry().getResourceServiceProvider(resource.getURI());
		if (resourceServiceProvider==null)
			return;
		IResourceDescription.Manager manager = resourceServiceProvider.getResourceDescriptionManager();
		if (manager != null) {
			IResourceDescription description = manager.getResourceDescription(resource);
			if (description != null) {
				Iterable<IEObjectDescription> descriptions = description.getExportedObjects();
				//Iterable<IEObjectDescription> filteredDescriptions = Iterables.filter(descriptions, (d) -> !(d.getEObjectOrProxy() instanceof AgentInstanceImpl));
				getHelper().checkUniqueNames(descriptions, cancelIndicator, this);
			}
		}
	}
	
}
