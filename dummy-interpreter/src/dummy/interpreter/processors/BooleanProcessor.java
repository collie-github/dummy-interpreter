package dummy.interpreter.processors;

import dummy.Statement;
import dummy.impl.BooleanExpression;

public class BooleanProcessor implements Processor<Boolean> {

	@Override
	public Boolean process(Statement s) {
		BooleanExpression bool = (BooleanExpression) s;		
		return bool.getValue();
	}

}
