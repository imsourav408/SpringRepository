package com.nt.comp;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public final class Vehicle {
	
	private String beanId;
	
	public Vehicle(String beanId) {
		this.beanId=beanId;
		System.out.println("Vehicle:: 1-param constructor");
	}
	
	public  void  entertainment() {
		System.out.println("Vehicle is equipped with  DVD Player  for entertainment");
	}
	
	public  void soundHorn() {
		System.out.println("Vehicle  is equippled with skoda horn  ");
	}
	
	public  void  fillFuel() {
		System.out.println("Vehicle is having fuel tank of 50 liters");
	}
	
	public void  journey(String  sourcePlace , String destPlace) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Engine engine=null;
		//create an extra IOC container
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		System.out.println("Extra container");
		//get target bean object
		engine=factory.getBean(beanId,Engine.class);
		engine.start();
		System.out.println("journey  started  at ::"+sourcePlace);
		System.out.println("journey is going on.......  from "+sourcePlace+" to "+destPlace);
		engine.stop();
		System.out.println("jounery ended at ::"+destPlace);
	}
}
		