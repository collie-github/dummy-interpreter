package dummy.impl;

import dummy.Statement;

public class Output implements Statement {
	private String text; 
	
	public Output(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
}
