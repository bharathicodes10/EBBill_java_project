package com.ksr.eb.exception;

public class InvalidReadingException extends Exception {
	public InvalidReadingException() {
		super("Invalid reading");
	}
	public String toString() {
		return("Invalid reading");
	}
}
