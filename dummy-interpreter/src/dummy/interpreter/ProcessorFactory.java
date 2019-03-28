package dummy.interpreter;

import dummy.Statement;
import dummy.impl.ANDExpression;
import dummy.impl.BooleanExpression;
import dummy.impl.IfStatement;
import dummy.impl.Output;
import dummy.interpreter.processors.ANDProcessor;
import dummy.interpreter.processors.BooleanProcessor;
import dummy.interpreter.processors.IfProcessor;
import dummy.interpreter.processors.OutputProcessor;
import dummy.interpreter.processors.Processor;

public class ProcessorFactory {
	public static Processor<?> createProcessor(Statement s) {
		if(s instanceof ANDExpression) {
			return new ANDProcessor();
		} else if(s instanceof BooleanExpression) {
			return new BooleanProcessor();
		} else if(s instanceof IfStatement) {
			return new IfProcessor();
		} else if(s instanceof Output) {
			return new OutputProcessor();
		} else return null;
	}
}
