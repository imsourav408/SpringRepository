package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.PersonsInfo;

public class NullInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonsInfo info=null,info2=null;
		//create spring factory object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		info=factory.getBean("sourav",PersonsInfo.class);
		System.out.println(info);
		System.out.println("--------------------------------------------------------");
		info2=factory.getBean("shruti",PersonsInfo.class);
		System.out.println(info2);
	}//main
}//class