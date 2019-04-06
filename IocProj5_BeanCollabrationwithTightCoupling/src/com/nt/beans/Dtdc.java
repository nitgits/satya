package com.nt.beans;

public class Dtdc {
	
	
	public Dtdc() {
		System.out.println("Dtdc:0 param constructor");
	}

	public final String deliver(int orderid) {
		return "DTDC is ready to deliver products of"+orderid;
		
	}

}
