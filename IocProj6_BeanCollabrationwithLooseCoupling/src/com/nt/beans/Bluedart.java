package com.nt.beans;

import java.util.Arrays;

public class Bluedart implements Courier {

	@Override
	public String deliver(String[] items, int orderid) {
		// TODO Auto-generated method stub
		return "Bluedart is ready to deliver products"+ Arrays.toString(items)+ "item id is"+orderid;
	}

}
