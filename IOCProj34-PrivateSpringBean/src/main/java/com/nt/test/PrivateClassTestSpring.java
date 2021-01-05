package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.TestBean;

public class PrivateClassTestSpring {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		TestBean tb1=null,tb2=null;
		Object db=null;
		//create spring bean factory object
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		tb1=factory.getBean("testbean1",TestBean.class);
		System.out.println(tb1);
		System.out.println("----------------------------------------------------------------------------");
		tb2=factory.getBean("testbean2",TestBean.class);
		System.out.println(tb2);
		db=factory.getBean("db",Object.class);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(db);
	}
}
