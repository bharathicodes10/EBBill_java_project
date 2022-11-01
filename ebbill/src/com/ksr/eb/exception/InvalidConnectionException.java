package com.ksr.eb.exception;

public class InvalidConnectionException extends Exception {
	public InvalidConnectionException() {
		super("Invalid connection");
	}
	public String toString() {
		return("Invalid connections");
	}
}

