/*
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SasDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/ufscar/sas/xtext/sasdsl/parser/antlr/internal/InternalSasDsl.tokens");
	}
}
