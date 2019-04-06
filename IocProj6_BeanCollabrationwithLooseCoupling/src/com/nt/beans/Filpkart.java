package com.nt.beans;

import java.util.Random;

public class Filpkart {
 private Courier courier;

public Filpkart(Courier courier) {
	this.courier = courier;
}

public Filpkart() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Filpkart:1 param constructor");
}
  public String purchase(String[] items) {
	  Random ran=new Random();
	 int id=ran.nextInt(10000);
	String supplyRes=courier.deliver(items, id);
	return supplyRes;
	 
	  
  }
 
}
