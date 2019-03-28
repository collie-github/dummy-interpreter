package dummy.interpreter.impl;

import java.util.List;

import dummy.Expression;
import dummy.Statement;
import dummy.impl.IfStatement;
import dummy.interpreter.Processor;

public class IfProcessor implements Processor<Void> {

	@Override
	public Void process(Statement s) {
		IfStatement ifStatement = (IfStatement) s;
		Expression condition = ifStatement.getCondition();
		List<Statement> thenStatements = ifStatement.getContentThen();
		List<Statement>	elseStatements = ifStatement.getContentElse();
		boolean isConditionTrue = (boolean) ProcessorFactory.createProcessor(condition).process(condition);
		if(isConditionTrue) {
			Interpreter.executeStatements(thenStatements);
		} else {
			Interpreter.executeStatements(elseStatements);
		}
		return null;
	}

}
