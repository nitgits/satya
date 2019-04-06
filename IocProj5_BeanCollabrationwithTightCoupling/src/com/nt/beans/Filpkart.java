package com.nt.beans;

import java.util.Random;

public class Filpkart {
	
	private Dtdc dtdc;

	Random ran=null;
	
	public void setDtdc(Dtdc dtdc) {
		this.dtdc = dtdc;
	}
	
	
	
	public Filpkart() {
     System.out.println("Filpkart:0 param constructor");
	}



	public String purchase(String items[]) {
		//generate order id
		ran=new Random();
		int orderid=ran.nextInt(1000);
		//deliver order
		String status=dtdc.deliver(orderid);
		return status+"Bill Amount for order id"+orderid;		
	}

}
