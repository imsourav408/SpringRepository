package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Employee;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ResolvingConstructorInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Marks marks=null;
		Employee employee=null;
		Student stud=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create reader object
		reader=new XmlBeanDefinitionReader(factory);
		//load the bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean object
		marks=factory.getBean("mk",Marks.class);
		System.out.println(marks);
		System.out.println("-------------------------------------------------");
		employee=factory.getBean("emp",Employee.class); System.out.println(employee);
		System.out.println("-------------------------------------------------");
		stud=factory.getBean("stud",Student.class);
		System.out.println(stud);
	}
}
