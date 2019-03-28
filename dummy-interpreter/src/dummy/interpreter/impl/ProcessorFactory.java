package dummy.interpreter.impl;

import java.util.List;

import dummy.Statement;
import dummy.impl.ANDExpression;
import dummy.impl.BooleanExpression;
import dummy.impl.IfStatement;
import dummy.interpreter.Processor;

public class ProcessorFactory {
	public static Processor<?> createProcessor(Statement s) {
		if(s instanceof ANDExpression) {
			return new ANDProcessor();
		} else if(s instanceof BooleanExpression) {
			return new BooleanProcessor();
		} else if(s instanceof IfStatement) {
			return new IfProcessor();
		} else return null;
	}
}
