package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Car;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Car car1=null,car2=null,car3=null;
		//create spring factory class object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load the spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean class object
		car1=factory.getBean("rajaCar",Car.class);
		System.out.println(car1);
		System.out.println("-----------------------------------------------------------------");
		car2=factory.getBean("bantyCar",Car.class);
		System.out.println(car2);
		System.out.println("-----------------------------------------------------------------");
		car3=factory.getBean("baseCar",Car.class);
		System.out.println(car3);
	}
}
