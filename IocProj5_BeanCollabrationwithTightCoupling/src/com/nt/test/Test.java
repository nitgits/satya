package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Filpkart;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory=null;
				
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		
		Filpkart filp=(Filpkart)factory.getBean("fpkt");
	    String bills=filp.purchase(new String[] {"fruitd","sweets"});
	   
		System.out.println("Result ---->"+bills);
		
		

	}

}
