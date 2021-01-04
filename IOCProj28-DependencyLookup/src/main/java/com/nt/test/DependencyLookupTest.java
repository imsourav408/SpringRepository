package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Vehicle;

public class DependencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Vehicle vehicle=null;
		//create spring bean factory object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		vehicle=factory.getBean("vehicle",Vehicle.class);
		//invoke methods
		vehicle.journey("hyd","warangal");
		vehicle.entertainment();
		vehicle.soundHorn();
		vehicle.fillFuel();
	}//main
}//class