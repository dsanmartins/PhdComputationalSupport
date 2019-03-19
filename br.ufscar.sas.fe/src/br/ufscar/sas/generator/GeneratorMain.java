package br.ufscar.sas.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class GeneratorMain {

	private static Injector injector = Guice.createInjector(new KDMGeneratorModule());
	

	public void mainGenerator(String modelInstance, String newJavaProject) {
		Generator generator = injector.getInstance(Generator.class);
		generator.runGenerator(modelInstance,newJavaProject);
	}

	static class Generator {
		
		@Inject 
		private Provider<ResourceSet> resourceSetProvider;
		
		@Inject
		private IResourceValidator validator;
		
		@Inject
		private IGenerator generator;
		
		@Inject 
		private JavaIoFileSystemAccess fileAccess;

		protected void runGenerator(String string, String newJavaProject) {
			// load the resource
			ResourceSet set = resourceSetProvider.get();
			Resource resource = set.getResource(URI.createFileURI(string), true);		
			// validate the resource
			List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			if (!list.isEmpty()) {
				for (Issue issue : list) {
					System.err.println(issue);
				}
			}	
			
			// configure and start the generator
			fileAccess.setOutputPath(newJavaProject);
			
			generator.doGenerate(resource, fileAccess);
			System.out.println("Code generation finished.");
		}
	}
}
