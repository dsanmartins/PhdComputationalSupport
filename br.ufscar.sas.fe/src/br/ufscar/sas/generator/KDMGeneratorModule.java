package br.ufscar.sas.generator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

/**
 * The ECoreGeneratorModule is used by the Guice injection engine
 * to connect the class of the Resource to the Generator.
 * 
 * @author jlangley
 *
 */
public class KDMGeneratorModule extends AbstractGenericResourceRuntimeModule {
 
	/**
	 * The use of the language name is not fully understood when using the 
	 * generator outside of the normal XText DSL context.
	 */
    @Override
    protected String getLanguageName() {
        return "does.not.seem.to.matter";
    }
 
    /**
     * This Generator works with *.xmi files.
     */
    @Override
    protected String getFileExtensions() {
        return "xmi";
    }
 
    /**
     * Returns the class that will be instantiated as the Generator.
     * @return EcoreGenerator.class
     */
    public Class<? extends IGenerator> bindIGenerator() {
        return KDMGenerator.class;
    }
 
    /**
     * Returns the class that will be used to load the resource.
     * @return
     */
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }
 
}