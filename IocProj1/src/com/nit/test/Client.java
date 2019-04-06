package com.nit.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nit.bean.Singleton;
import com.nit.bean.WishMessageGenerator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Spring");
		
		WishMessageGenerator wish=null;
		Resource res=null;
		BeanFactory factory=null;
		//locate spring bean configuration file
		 res= new FileSystemResource("src/com/nit/cfg/applicationContext.xml");
		 factory=new XmlBeanFactory(res);
		
		//get bean object
		
		//WishMessageGenerator wish=(WishMessageGenerator)factory.getBean("wsg");
		Object obj=factory.getBean("wsg");
		 wish=(WishMessageGenerator)obj;
		
		String result=wish.generate();
		System.out.println("Result ---->"+result);
		
	
		
		
	}

}
 