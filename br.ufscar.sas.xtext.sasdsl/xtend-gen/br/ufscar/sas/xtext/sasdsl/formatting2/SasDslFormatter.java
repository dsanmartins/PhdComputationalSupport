package br.ufscar.sas.xtext.sasdsl.formatting2;

import br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition;
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SasDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SasDslGrammarAccess _sasDslGrammarAccess;
  
  protected void _format(final ArchitectureDefinition architecture, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(architecture).keyword(this._sasDslGrammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_1());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(architecture).keyword(this._sasDslGrammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_3());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
  }
  
  public void format(final Object architecture, final IFormattableDocument document) {
    if (architecture instanceof XtextResource) {
      _format((XtextResource)architecture, document);
      return;
    } else if (architecture instanceof ArchitectureDefinition) {
      _format((ArchitectureDefinition)architecture, document);
      return;
    } else if (architecture instanceof EObject) {
      _format((EObject)architecture, document);
      return;
    } else if (architecture == null) {
      _format((Void)null, document);
      return;
    } else if (architecture != null) {
      _format(architecture, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(architecture, document).toString());
    }
  }
}
