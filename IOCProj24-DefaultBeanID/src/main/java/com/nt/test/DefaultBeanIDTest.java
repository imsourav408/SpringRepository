package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.PersonInfo;

public class DefaultBeanIDTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonInfo info1=null,info2=null,info3=null,info4=null;
		//create factory class object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		info1=factory.getBean("com.nt.comp.PersonInfo",PersonInfo.class);
		System.out.println(info1);
		info1=factory.getBean("com.nt.comp.PersonInfo#0",PersonInfo.class);
		System.out.println(info1);
		info1=factory.getBean("com.nt.comp.PersonInfo#1",PersonInfo.class);
		System.out.println(info1);
		info1=factory.getBean("com.nt.comp.PersonInfo#2",PersonInfo.class);
		System.out.println(info1);
	}//main
}//class