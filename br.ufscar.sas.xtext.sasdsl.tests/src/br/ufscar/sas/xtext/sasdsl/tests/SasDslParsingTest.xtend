/*
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.tests

import br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(SasDslInjectorProvider)
class SasDslParsingTest{

	@Inject
	ParseHelper<ArchitectureDefinition> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
