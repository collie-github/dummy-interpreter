package dummy.interpreter.processors;

import dummy.Statement;
import dummy.impl.Output;

public class OutputProcessor implements Processor<Void> {

	@Override
	public Void process(Statement s) {
		Output output = (Output) s;
		System.out.println(output.getText());
		return null;
	}

}
