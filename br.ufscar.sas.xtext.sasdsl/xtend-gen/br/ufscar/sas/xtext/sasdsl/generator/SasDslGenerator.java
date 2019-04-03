/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.generator;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAbstraction;
import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SasDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<DSLAbstraction> _filter = Iterables.<DSLAbstraction>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), DSLAbstraction.class);
    for (final DSLAbstraction e : _filter) {
      System.out.println(e.getName());
    }
  }
}
