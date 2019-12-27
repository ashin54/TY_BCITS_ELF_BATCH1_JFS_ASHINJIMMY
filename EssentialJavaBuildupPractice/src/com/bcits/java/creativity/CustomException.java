package com.bcits.java.creativity;

public class CustomException extends Exception {
	String message;

//	public CustomException() {
//		super();
//	}

	public CustomException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	

}
