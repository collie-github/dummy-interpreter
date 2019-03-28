package dummy.interpreter.processors;

import dummy.Statement;

public interface Processor<T> {
	T process(Statement s);
}
