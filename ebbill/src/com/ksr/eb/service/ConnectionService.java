package com.ksr.eb.service;

import com.ksr.eb.entity.Commercial;
import com.ksr.eb.entity.Domestic;
import com.ksr.eb.exception.InvalidConnectionException;
import com.ksr.eb.exception.InvalidReadingException;

public class ConnectionService extends Exception{
	public float domrate[] ={(float)2.3,(float)4.2,(float)5.5};
	public float comrate[] = {(float)5.2,(float)6.8,(float)8.3};
	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException{
		if (currentReading < previousReading) {
			throw new InvalidReadingException();
		}
		else if (!type.equals("Domestic") && !type.equals("Commercial")) {
			throw new InvalidConnectionException();
		}
		return true;
	}
	public float calculateBillAmt(int currentReading, int previousReading, String type) {
		float bill;
		try {
			validate(currentReading, previousReading, type);
		}
		catch(InvalidReadingException e) {
			return -1;
		}
		catch(InvalidConnectionException e) {
			return -2;
		}
		if(type.equals("Domestic")) {
			Domestic d = new Domestic(currentReading, previousReading,domrate);
			bill = d.computeBill();
		}
		else {
			Commercial c = new Commercial(currentReading, previousReading, comrate);
			bill = c.computeBill();
		}
		return bill;
	}
	
	public String generateBill(int currentReading, int previousReading, String type) {
		float read = calculateBillAmt(currentReading, previousReading, type);
		if(read==-1) {
			return "Incorrect Reading";
		}
		else if(read==-2) {
			return "Incorrect Connection";
		}
		else {
			return "Amount to be paid : "+read;
		}
	}
		
	
}
