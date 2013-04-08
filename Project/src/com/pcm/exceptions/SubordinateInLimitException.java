package com.pcm.exceptions;

public class SubordinateInLimitException extends Exception {

		public SubordinateInLimitException(){
			super("Number of subordinate already in limit");
		}
}
