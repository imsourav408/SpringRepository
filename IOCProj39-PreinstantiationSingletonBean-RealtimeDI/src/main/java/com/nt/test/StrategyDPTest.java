package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Flipkart flipkart=null;
		String msg=null;
		//create the spring container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("IOC container (ApplicationContext) is created");
		//get target bean object
		flipkart=context.getBean(Flipkart.class,"fkart");
		//invoke the business methods
		msg=flipkart.shopping(new String[] {"Watch","Shoes","Glass"},new float[] {12000,8000,3000});
		System.out.println(msg);	
		((AbstractApplicationContext) context).close();
	}

}
