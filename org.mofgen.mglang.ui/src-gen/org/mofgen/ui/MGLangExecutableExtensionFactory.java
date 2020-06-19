/*
 * generated by Xtext 2.20.0
 */
package org.mofgen.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.mofgen.mglang.ui.internal.MglangActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MGLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MglangActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MglangActivator activator = MglangActivator.getInstance();
		return activator != null ? activator.getInjector(MglangActivator.ORG_MOFGEN_MGLANG) : null;
	}

}
