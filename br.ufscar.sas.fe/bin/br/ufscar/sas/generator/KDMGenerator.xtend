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

import br.ufscar.sas.ocl.OCLQuery
import java.util.Iterator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class KDMGenerator implements IGenerator {

	ClassUnitGenerator classUnitGenerator = new ClassUnitGenerator
	OCLQuery oclQuery;
	Iterator<ClassUnit> rs;
	ClassUnit _class;
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		oclQuery = new OCLQuery(resource)
		rs = oclQuery.getClasses();

		while (rs.hasNext())
		{
			_class = rs.next() as ClassUnit;
			classUnitGenerator.generateClassUnit(_class, fsa)
		}
	}
}
