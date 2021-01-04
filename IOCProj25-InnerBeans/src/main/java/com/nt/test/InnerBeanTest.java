package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.ProffessionalCrickter;

public class InnerBeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		ProffessionalCrickter crickter1=null,crickter2=null;
		//create bean factory object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean objects
		crickter1=factory.getBean("kohli",ProffessionalCrickter.class);
		System.out.println(crickter1.batting());
		crickter2=factory.getBean("dhoni",ProffessionalCrickter.class);
		System.out.println(crickter2.batting());
	}//main
}//class