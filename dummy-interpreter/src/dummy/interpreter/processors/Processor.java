package dummy.interpreter.processors;

import dummy.structure.Statement;

public interface Processor<T> {
	T process(Statement s);
}
