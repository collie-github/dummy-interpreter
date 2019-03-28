package dummy.interpreter.impl;

import dummy.Statement;
import dummy.impl.Output;
import dummy.interpreter.Processor;

public class OutputProcessor implements Processor<Void> {

	@Override
	public Void process(Statement s) {
		Output output = (Output) s;
		System.out.println(output.getText());
		return null;
	}

}
