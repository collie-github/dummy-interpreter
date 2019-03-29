package dummy.interpreter;

import dummy.interpreter.processors.ANDProcessor;
import dummy.interpreter.processors.BooleanProcessor;
import dummy.interpreter.processors.IfProcessor;
import dummy.interpreter.processors.OutputProcessor;
import dummy.interpreter.processors.Processor;
import dummy.structure.Statement;
import dummy.structure.impl.ANDExpression;
import dummy.structure.impl.BooleanExpression;
import dummy.structure.impl.IfStatement;
import dummy.structure.impl.Output;

/**
 * Chooses a processor for any given Statement
 */
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
