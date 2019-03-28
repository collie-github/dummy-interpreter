package dummy.interpreter;

import java.util.ArrayList;
import java.util.List;

import dummy.Statement;

public class Program {
	private List<Statement> statements;
	
	public List<Statement> getStatements() {
		return this.statements;
	}
	
	public Program(List<Statement> statements) {
		this.statements = statements;
	}
	
	public Program() {
		this.statements = new ArrayList<Statement>();
	}
	
	public void addStatement(Statement s) {
		statements.add(s);
	}
}
