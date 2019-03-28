package dummy.impl;

import java.util.List;

import dummy.Expression;
import dummy.Statement;

public class IfStatement implements Statement {
	private Expression condition;
	private List<Statement> contentThen;
	private List<Statement> contentElse;
	
	public IfStatement(Expression condition, List<Statement> thenContent, List<Statement> elseContent) {
		this.condition = condition;
		this.contentElse = elseContent;
		this.contentThen = thenContent;
	}

	public Expression getCondition() {
		return condition;
	}

	public List<Statement> getContentThen() {
		return contentThen;
	}

	public List<Statement> getContentElse() {
		return contentElse;
	}
	
	
}
