package dummy.structure.impl;

import dummy.structure.Expression;

public class ANDExpression implements Expression {
	private Expression leftBool;
	private Expression rightBool;
	
	public ANDExpression(Expression left, Expression right) {
		this.leftBool = left;
		this.rightBool = right;
	}
	
	public static ANDExpression creaeteNew(Expression left, Expression right) {
		return new ANDExpression(left, right);
	}
	
	public Expression getLeftBool() {
		return leftBool;
	}
	public Expression getRightBool() {
		return rightBool;
	}
}
