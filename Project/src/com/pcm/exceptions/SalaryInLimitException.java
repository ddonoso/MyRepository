package com.pcm.exceptions;

@SuppressWarnings("all")
public class SalaryInLimitException extends Exception{
	public SalaryInLimitException(){
		super("Salary in Limit");
	}
}
