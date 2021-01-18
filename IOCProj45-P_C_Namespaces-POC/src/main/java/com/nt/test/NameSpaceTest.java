package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class NameSpaceTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Employee employee=null;
		//create IOC container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		employee=context.getBean(Employee.class,"emp");
		System.out.println(employee);
		//close IOC container
		((AbstractApplicationContext)context).close();
	}

}
