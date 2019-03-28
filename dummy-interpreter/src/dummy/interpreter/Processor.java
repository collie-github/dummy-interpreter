package dummy.interpreter;

import dummy.Statement;

public interface Processor<T> {
	T process(Statement s);
}
