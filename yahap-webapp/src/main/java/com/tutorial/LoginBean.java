package com.tutorial;

public class LoginBean {
	String name;
	ComplexPassword password;
	
	public LoginBean() {
		super();
		password = new ComplexPassword();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public ComplexPassword getPassword() {
		return password;
	}
	
	public void setPassword(ComplexPassword password) {
		this.password = password;
	}
	
	public static class ComplexPassword {
		String inputText;
		long convertedID;
		public long getConvertedID() {return convertedID;}
		public void setConvertedID(long convertedText) {
			this.convertedID = convertedText;
		}
		public String getInputText() {return inputText;}
		public void setInputText(String inputText) {
			this.inputText = inputText;
		}
		
	}
}
