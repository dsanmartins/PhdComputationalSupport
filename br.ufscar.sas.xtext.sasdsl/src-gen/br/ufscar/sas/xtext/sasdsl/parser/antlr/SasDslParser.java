/*
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.parser.antlr;

import br.ufscar.sas.xtext.sasdsl.parser.antlr.internal.InternalSasDslParser;
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SasDslParser extends AbstractAntlrParser {

	@Inject
	private SasDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSasDslParser createParser(XtextTokenStream stream) {
		return new InternalSasDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ArchitectureDefinition";
	}

	public SasDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SasDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
