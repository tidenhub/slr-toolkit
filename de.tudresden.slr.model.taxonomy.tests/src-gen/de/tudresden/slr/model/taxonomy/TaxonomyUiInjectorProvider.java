/*
 * generated by Xtext
 */
package de.tudresden.slr.model.taxonomy;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TaxonomyUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return de.tudresden.slr.model.taxonomy.ui.internal.TaxonomyActivator.getInstance().getInjector("de.tudresden.slr.model.taxonomy.Taxonomy");
	}
	
}
