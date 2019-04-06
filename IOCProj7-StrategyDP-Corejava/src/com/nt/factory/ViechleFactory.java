package com.nt.factory;

import com.nt.components.CNGEngine;
import com.nt.components.DieselEngine;
import com.nt.components.Enginee;
import com.nt.components.PetrolEngine;
import com.nt.components.Vihecle;

public class ViechleFactory {
	
	public static Vihecle getInstance(String egineType) {
		
		Vihecle vihecle=null;
		Enginee  engg=null;
		
		//create depent class object
		if(egineType.equalsIgnoreCase("Petrol"))
		{
			engg=new PetrolEngine();
		}
		else if(egineType.equalsIgnoreCase("Diesel")) {
			engg=new DieselEngine();
		}
		else if(egineType.equalsIgnoreCase("CNG")) {
			engg=new CNGEngine();
		}
		else {
			throw new IllegalArgumentException("Invalid Enginetypes");
		}
		//create vihecle object
		vihecle=new Vihecle();
		vihecle.setEngg(engg);
		return vihecle;
		
	}

}
