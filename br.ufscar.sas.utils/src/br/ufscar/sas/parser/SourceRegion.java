package br.ufscar.sas.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;

import br.ufscar.sas.modisco.Manager;

public class SourceRegion {


	public SourceRegion(){

	}

	public void statementsByLine(File projectDir) {

		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			try 
			{ 
				//Get Class Name
				String token[] = path.split("\\/"); 
				String className = token[token.length-1].split("\\.")[0];

				//Get Fields of a class
				CompilationUnit cu = JavaParser.parse(file);
				FieldClassVisitor fdc = new FieldClassVisitor();
				List<FieldDeclaration> listFd = fdc.getFieldClasses(cu);
				for (int i = 0; i< listFd.size(); i ++)
				{
					NodeList<VariableDeclarator> nl = listFd.get(i).getVariables();
					for (int j = 0; j< nl.size(); j++)
					{
						String fieldName = nl.get(j).toString();
						int startLine = listFd.get(i).getBegin().get().line;
						int endLine = listFd.get(i).getEnd().get().line;
						this.lineNumbersGenerator(1,projectDir.getPath() + "/", 
								projectDir.getName() +"_KDM" + ".xmi", 
								projectDir.getName() + "_KDM", 
								className,
								fieldName, 
								startLine, 
								endLine); 
					}
				}


				MethodVisitor md = new MethodVisitor();
				List<MethodDeclaration>  listMd = md.getMethodClasses(cu); 
				for (int i = 0; i< listMd.size(); i ++)
				{
					String methodName = listMd.get(i).getName().toString();
					int startLine = listMd.get(i).getBegin().get().line;
					int endLine = listMd.get(i).getEnd().get().line;

					this.lineNumbersGenerator(2,projectDir.getPath() + "/", 
							projectDir.getName() +"_KDM" + ".xmi", 
							projectDir.getName() + "_KDM", 
							className,
							methodName, 
							startLine, 
							endLine); 
					
					
					VariableVisitor vv = new VariableVisitor();
					List<VariableDeclarationExpr> listVD = vv.getVariableExpr(listMd.get(i));
					for (int j=0; j< listVD.size(); j++)
					{
						String variable = listVD.get(j).toString();
						startLine = listVD.get(j).getBegin().get().line;
						endLine = listVD.get(j).getEnd().get().line;
										
						this.lineNumbersGenerator(4,projectDir.getPath() + "/", 
								projectDir.getName() +"_KDM" + ".xmi", 
								projectDir.getName() + "_KDM", 
								className,
								listMd.get(i).getName() + "|" + variable, 
								startLine, 
								endLine); 
					}
				}
				
				ClassVisitor cv = new ClassVisitor();
				List<ClassOrInterfaceDeclaration> listCID = cv.getClassesOrInterfaces(cu);
				for (int i=0; i< listCID.size(); i++)
				{
					String classOrInterfaceName = listCID.get(i).getName().toString();
					int startLine = listCID.get(i).getBegin().get().line;
					int endLine = listCID.get(i).getEnd().get().line;
					
					this.lineNumbersGenerator(3,projectDir.getPath() + "/", 
							projectDir.getName() +"_KDM" + ".xmi", 
							projectDir.getName() + "_KDM", 
							classOrInterfaceName,
							"", 
							startLine, 
							endLine); 
					
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).explore(projectDir);

	}

	public void lineNumbersGenerator(int op, String path, String file, String dbName, String className, String elementName, int startLine , int endLine) {

		Manager baseXManager=null;

		try {
			baseXManager = new Manager(path, file, dbName);
		} catch (BaseXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			baseXManager.openDB();
		} catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (op == 2)
		{
			
			//EndLine
			try {
				baseXManager.createLineMU(className, elementName, "endLine", endLine);
			} catch (QueryException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			//StartLine
			try {
				baseXManager.createLineMU(className, elementName, "startLine", startLine);
			} catch (QueryException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else
		{
			if (op == 1)
			{
				
				//EndLine
				try {
					baseXManager.createLineSto(className, elementName, "endLine", endLine);
				} catch (QueryException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//StartLine
				try {
					baseXManager.createLineSto(className, elementName, "startLine", startLine);
				} catch (QueryException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				if (op == 3)
				{
					//EndLine
					try {
						baseXManager.createLineClass(className, "endLine", endLine);
					} catch (QueryException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					//StartLine
					try {
						baseXManager.createLineClass(className, "startLine", startLine);
					} catch (QueryException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
				{
					if (op == 4)
					{
						//EndLine
						try {
							baseXManager.createLineVariable(className, elementName.split("\\|")[0], elementName.split("\\|")[1], "endLine", endLine);
						} catch (QueryException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						//StartLine
						try {
							baseXManager.createLineVariable(className, elementName.split("\\|")[0], elementName.split("\\|")[1], "startLine", startLine);
						} catch (QueryException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		}

		try {
			baseXManager.exportDB();
		} catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			baseXManager.closeDB();
		} catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
