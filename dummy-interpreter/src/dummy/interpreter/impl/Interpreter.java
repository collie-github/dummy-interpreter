package dummy.interpreter.impl;

import java.util.List;

import dummy.Statement;

public class Interpreter {
	
	public void interpret(Program p) {
		List<Statement> statements = p.getStatements();
		executeStatements(statements);
	}
	
	public static void executeStatements(List<Statement> statements) {
		for(Statement s : statements) {
			ProcessorFactory.createProcessor(s).process(s);
		}
	}
}
