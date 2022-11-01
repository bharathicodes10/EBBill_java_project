package com.ksr.eb.entity;

public class Domestic extends Connection {
	public Domestic(int currentReading, int previousReading,float slabs[])
	{
		super( currentReading,previousReading,slabs);
	}
	public float computeBill(){
		float bill;
		int current = setCurrentReading();
		int previous = setPreviousReading();
		float slabs[] = setSlabRate();
		int read = current - previous;
		System.out.println("Current Reading: "+currentReading+"Previous Reading: "+previousReading+
				"Reading: "+read);
		if(read <= 50) {
			bill = (float)(read * slabs[0]);
		}
		else if (read > 50 && read <= 100) {
			bill = (float) ((50*slabs[0])+(read-50) * slabs[1]);
		}
		else {
			bill = (float) ((50*slabs[0])+(50*slabs[1])+((read-100)* slabs[2]));
		}
		return bill;
	}
}
