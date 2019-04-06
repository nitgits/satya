package com.nt.components;

import java.util.Arrays;

public class Vihecle {
	private Enginee engg;

	public void setEngg(Enginee engg) {
		this.engg = engg;
	}

	public Vihecle() {
		// TODO Auto-generated constructor stub
		System.out.println("Viehcle 0:param constructor");
	}
	
	
public void journery(String startplace,String destpalce) {
	engg.start();
	System.out.println("Engine started"+startplace);
	engg.stop();
	System.out.println("Engine stop"+destpalce);
	
}
}
