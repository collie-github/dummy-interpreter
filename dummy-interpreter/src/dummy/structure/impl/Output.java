package dummy.structure.impl;

import dummy.structure.Statement;

public class Output implements Statement {
	private String text; 
	
	public Output(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
}
