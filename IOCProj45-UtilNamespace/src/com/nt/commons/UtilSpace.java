package com.nt.commons;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UtilSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=null;
		List<String> list=null;
		List<Date> dt=null;
		List<Integer> i=null;
		
		Set<String> st=null;
		Set<Date> sd=null;
		
		Map<Integer, String> m=null;
		Map<String,Date> m1=null;
		
		//properties 
		Properties proc1=null,proc2=null;
		Float f=null;
		
		
		
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//list in collection
		list=ctx.getBean("list",List.class);
		System.out.println("The 1st list is"+list.getClass());
		
		dt=ctx.getBean("dt",List.class);
		System.out.println("date is "+dt);
		i=ctx.getBean("inte",List.class);
		System.out.println("interger class is... "+i.getClass());
		System.out.println("integer values are"+i.toString());
		System.out.println("integer index is :"+i.get(4));
		
		//set collection
		st=ctx.getBean("st",Set.class);
		System.out.println("Set String class... "+st.getClass());
		System.out.println("Set String values are"+st.toString());
		sd=ctx.getBean("setdt",Set.class);
		System.out.println("Set date class... "+sd.getClass());
		System.out.println("Set date: "+sd.toString());
		
		m=ctx.getBean("mp",Map.class);
		
		System.out.println("map  class... "+m.getClass());
		System.out.println("map values: "+m.toString());
		
        m1=ctx.getBean("mp1",Map.class);
		
		System.out.println("map11  class... "+m1.getClass());
		System.out.println("map values: "+m1.toString());
		 
		proc1=ctx.getBean("proc",Properties.class);
		System.out.println("properties  class... "+proc1.getClass());
		System.out.println("properties ... "+proc1);
		
		proc2=ctx.getBean("proc2",Properties.class);
		System.out.println("properties  file class... "+proc2.getClass());
		System.out.println("properties values ... "+proc2);
		
		f=ctx.getBean("MPI",Float.class);
		System.out.println("Float  file class... "+f.getClass());
		System.out.println("Float values ... "+f);
		
		//close loc container applicationcontext
		((AbstractApplicationContext) ctx).close();
	}
	

}
