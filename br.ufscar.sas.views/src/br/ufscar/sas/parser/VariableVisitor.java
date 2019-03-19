package br.ufscar.sas.parser;

import java.util.ArrayList;
import java.util.List;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class VariableVisitor extends VoidVisitorAdapter<Void> {

	List<VariableDeclarationExpr> listVar = new ArrayList<VariableDeclarationExpr>();

	@Override
	public void visit(VariableDeclarationExpr n, Void arg) {
		listVar.add(n);
		super.visit(n, arg);
	}

	public List<VariableDeclarationExpr> getVariableExpr(MethodDeclaration md) {
		md.accept(this, null);
		return listVar;
	}
}
