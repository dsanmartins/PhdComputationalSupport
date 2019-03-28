
package br.ufscar.sas.xtext.sasdsl.formatting2

import br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage

class SasDslFormatter extends AbstractFormatter2 {
	
	@Inject extension SasDslGrammarAccess
	
	def dispatch void format(ArchitectureDefinition architecture, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		
		val open = architecture.regionFor.keyword(architectureDefinitionAccess.leftCurlyBracketKeyword_1)
		val close = architecture.regionFor.keyword(architectureDefinitionAccess.rightCurlyBracketKeyword_3)
		
		open.append[newLine]
		interior(open,close)[indent]
		
		
	
	} 
}
 
