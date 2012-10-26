
package de.nie.fin;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FinStandaloneSetup extends FinStandaloneSetupGenerated{

	public static void doSetup() {
		new FinStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

