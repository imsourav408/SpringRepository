package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EnggCourse course1=null,course2=null;
		//create factory object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target class object
		course1=factory.getBean("eee",EnggCourse.class);
		System.out.println(course1);
		course2=factory.getBean("mech",EnggCourse.class);
		System.out.println(course2);
	}//main
}//class