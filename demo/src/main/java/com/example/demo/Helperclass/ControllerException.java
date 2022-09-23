package com.example.demo.Helperclass;

public class ControllerException extends RuntimeException {

	private String Message;
	
	public ControllerException(String Message) {
		super(Message);
		this.Message=Message;
		
	}
	
}
