package dummy.interpreter.impl;

import java.util.ArrayList;
import java.util.List;

import dummy.Statement;
import dummy.impl.ANDExpression;
import dummy.impl.BooleanExpression;
import dummy.impl.IfStatement;
import dummy.impl.Output;

public class Demo {
	public static void main(String[] args) {
		Program prog = createDemoProgram();
		Interpreter interpreter = new Interpreter();
		interpreter.interpret(prog);
	}
	
	private static Program createDemoProgram() {
		BooleanExpression bTrue = new BooleanExpression(true);
		BooleanExpression bTrue2 = new BooleanExpression(true);
		ANDExpression innerAND = new ANDExpression(bTrue, bTrue2);
		ANDExpression outerAND = new ANDExpression(innerAND, bTrue);
		Output thenSuccess = new Output("IfStatement was evaluated to TRUE and THEN is being processed...");
		List<Statement> thenStatements = new ArrayList<Statement>();
		thenStatements.add(thenSuccess);
		IfStatement ifStatement = new IfStatement(outerAND, thenStatements, new ArrayList<Statement>());
		Program prog = new Program();
		prog.addStatement(ifStatement);
		return prog;
		
	}
}
