package com.pcm.exceptions;

import com.pcm.interfaces.IGoldenParachute;

public class PresidentException extends Exception implements IGoldenParachute{

	public PresidentException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
