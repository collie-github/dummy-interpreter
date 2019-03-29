package dummy.interpreter.processors;

import dummy.interpreter.ProcessorFactory;
import dummy.structure.Expression;
import dummy.structure.Statement;
import dummy.structure.impl.ANDExpression;

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
