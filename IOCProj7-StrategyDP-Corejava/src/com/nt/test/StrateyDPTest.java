package com.nt.test;

import com.nt.components.DieselEngine;
import com.nt.components.Vihecle;
import com.nt.factory.ViechleFactory;

public class StrateyDPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vihecle vihecle=null;
		vihecle=ViechleFactory.getInstance("Diesel");
		vihecle.journery("bangulur", "chennai");
		System.out.println("=============");

	}

}
