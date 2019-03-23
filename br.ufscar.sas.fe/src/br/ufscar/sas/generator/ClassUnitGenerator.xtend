/*******************************************************************************
 * Copyright (c)  2016 Daniel San Martin Santibanez.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *    Daniel San Martin Santibanez - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
package br.ufscar.sas.generator

import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit
import org.eclipse.gmt.modisco.omg.kdm.code.Signature
import org.eclipse.gmt.modisco.omg.kdm.code.StorableUnit
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.gmt.modisco.omg.kdm.action.BlockUnit
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement
import org.eclipse.gmt.modisco.omg.kdm.action.Addresses
import org.eclipse.gmt.modisco.omg.kdm.action.Reads

class ClassUnitGenerator {

	/**
	 * Generates the ClassUnit for each class in an KDM.
	 */
	def generateClassUnit(ClassUnit classUnit, IFileSystemAccess fsa) {

		fsa.generateFile(classUnit.name + ".java", '''
				public class «classUnit.name»{
				
				
				«FOR storableUnit: classUnit.codeElement»
				   «IF storableUnit instanceof StorableUnit»
				   		private «storableUnit.type.name» «storableUnit.name»;
				   «ENDIF»
				«ENDFOR»
				
				«FOR methodUnit: classUnit.codeElement»
				«IF methodUnit instanceof MethodUnit»
				«IF methodUnit.kind.getName.equals("method")»
					«FOR signature: methodUnit.codeElement»
					«IF signature instanceof Signature»
							«methodUnit.export» «FOR parameterUnit : signature.parameterUnit»«IF parameterUnit.kind.getName.equals("return")» «parameterUnit.type.name»  «ENDIF»«ENDFOR»«methodUnit.name»(«createMethodParameters(signature)»)
					«ENDIF»
					«ENDFOR»
					«FOR blockUnit: methodUnit.codeElement»
					«IF blockUnit instanceof BlockUnit»
					{
						«blockUnit(blockUnit)»
					}
					«ENDIF»
					«ENDFOR»
					
				«ENDIF»
				«ENDIF»
				«ENDFOR»
				}
			''')
	}
	
	def String createMethodParameters(Signature signature){
		
		var parameterUnit = signature.getParameterUnit()
		var str = ""
		for (param : parameterUnit){
			if (!param.kind.getName.equals("return"))
				str = str + param.type.name + " " + param.name + ","
		} 
		if (str.length > 0)
			str = str.substring(0,str.length-1)
		return str
	}
	
	def String blockUnit(BlockUnit blockUnit){
		var str = ""
		var variable1 ="";
		var variable2 ="";
		var variable3 ="";
		var variable4 ="";
		var ce = blockUnit.codeElement
		for (bu : ce)
		{
			if (bu instanceof ActionElement)
			{
				if (bu.name.equals("expression statement"))
				{
					var actionElement = bu.codeElement
					for (ae : actionElement)
					{
						if (ae instanceof ActionElement)
						{
							if (ae.name.equals("ASSIGN")) 
							{
								var actionElement2 = ae.codeElement
								for (ae2 : actionElement2)
								{
									if (ae2 instanceof ActionElement)
									{	
										if (ae2.name.equals("field access")) 
										{
											var actionElement3 = ae2.codeElement
											for (ae3 : actionElement3)
											{
												if (ae3 instanceof ActionElement)
												{
													if (ae3.name.equals("this")) 
													{
														variable1 = "this."
													}
												}
											}
											var actionRelation = ae2.actionRelation
											for (ar : actionRelation)
											{
												if (ar instanceof Addresses)
												{
													variable2 = ar.to.name + "="
												}
											}
										}
									}	
								}
								var actionRelation2 = ae.actionRelation
								for (ar2 : actionRelation2)
								{
									if (ar2 instanceof Reads)
									{
										variable3 = ar2.to.name
									}
								}
							}
						}
						str = str + System.lineSeparator + variable1 + variable2 + variable3 + ";"
					}
				}
				
				if (bu.name.equals("return"))
				{
					var actionRelation = bu.actionRelation
					for (ar : actionRelation)
					{
						if (ar instanceof Reads)
						{
							variable4 = "return " + ar.to.name + ";"
						}
					}
					str = str + System.lineSeparator + variable4
				}
			}
		}
		return str
	}
}