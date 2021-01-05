package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public final class AutowiringAutodetectTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Flipkart fpkt=null;
		//create bean factory object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		fpkt=factory.getBean("fpkt",Flipkart.class);
		//use target class business method
		System.out.println(fpkt.shopping(new String[]{"watch","shoe","dress"},new float[] {27003.32f,12343.00f,22000}));
	}//main
}//class