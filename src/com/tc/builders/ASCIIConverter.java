package com.tc.builders;

public abstract class ASCIIConverter implements TextConverter {

	private String asciiText; 
	
	@Override
	public void convertCharacter(String text) {
		this.asciiText = text;
	}
	
	public String getASCIIText() {
		return asciiText;
	}
	

}
