package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Student;

public class Setter_ConstructorInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Student student=null;
		try {
			//create IOC container
			factory=new DefaultListableBeanFactory();
			//create reader object
			reader=new XmlBeanDefinitionReader(factory);
			//specify the name and location of spring bean configuration
			reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
			//get target bean class object
			student=factory.getBean("stud",Student.class);
			System.out.println(student);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
