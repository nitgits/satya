package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Filpkart;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Ioc container
		BeanFactory factory=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfg/applicationContext.xml"));
		
		Filpkart fp=(Filpkart)factory.getBean("fpkt");
		
		String result=fp.purchase(new String[] {"Flowers","Fruits","Swetts"});
	}

}
