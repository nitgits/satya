package com.nit.bean;

import java.util.Date;

public class WishMessageGenerator {

	private String name;
	private Date date;
	private Example exp;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	 public void setExp(Example exp) {
		this.exp = exp;
	}
	public String generate() {
		int hour=date.getHours();
		if(hour<12) {
			 return "GoodMorning "+" "+name+" "+exp+" Time is-->"+date;
		}
		else if(hour<16) {
			 return "GoodAfter "+" "+name+" "+exp+" Time is-->"+date;
		}
		else if(hour<20) {
			 return "GoodEvening "+" "+name+" "+exp+" Time is-->"+date;
		}
		 		 return "GoodNight "+" "+name+" "+exp+" Time is-->"+date;
	 }
	
}
