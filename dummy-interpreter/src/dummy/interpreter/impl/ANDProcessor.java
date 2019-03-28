package dummy.interpreter.impl;

import dummy.Expression;
import dummy.Statement;
import dummy.impl.ANDExpression;
import dummy.interpreter.Processor;

public class ANDProcessor implements Processor<Boolean> {

	@Override
	public Boolean process(Statement s) {
		boolean result = false;
		ANDExpression and = (ANDExpression) s;
		Expression left = and.getLeftBool();
		Expression right = and.getRightBool();
		Processor<?> leftProcessor = ProcessorFactory.createProcessor(left);
		Processor<?> rightProcessor = ProcessorFactory.createProcessor(right);
		boolean resultLeft = (Boolean) leftProcessor.process(left);
		boolean resultRight = (Boolean) rightProcessor.process(right);
		
		if(resultLeft && resultRight) {
			result = true;
		}
		
		return result;
	}
	
}
