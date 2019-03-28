package dummy.interpreter.impl;

import dummy.Statement;
import dummy.impl.BooleanExpression;
import dummy.interpreter.Processor;

public class BooleanProcessor implements Processor<Boolean> {

	@Override
	public Boolean process(Statement s) {
		BooleanExpression bool = (BooleanExpression) s;		
		return bool.getValue();
	}

}
