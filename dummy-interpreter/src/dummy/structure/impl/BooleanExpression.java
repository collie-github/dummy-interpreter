package dummy.structure.impl;

import dummy.structure.Expression;

public class BooleanExpression implements Expression {
	private boolean value;
	
	public BooleanExpression(boolean value) {
		this.value = value;
	}
	
	public static BooleanExpression createNew(boolean value) {
		return new BooleanExpression(value);
	}
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
	public boolean getValue() {
		return this.value;
	}
}
