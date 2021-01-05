package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class AutowireCandidateTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Flipkart flipkart=null;
		//create spring factory class object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		flipkart=factory.getBean("fpkt",Flipkart.class);
		//use the business method
		System.out.println(flipkart.shopping(new String[] {"mobile phone","ear phone","camera"},new float[] {120000,23000,132111}));
	}//main
}//class