package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class RefAttributeTest {

	public static void main(String[] args) {
		ApplicationContext parentCtx=null,childCtx=null;
		Employee employee=null;
		//create parent IOC container
		parentCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/parent-bean.xml");
		//create child IOC container
		childCtx=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/child-bean.xml"},parentCtx);
		//get target bean object
		employee=(Employee)childCtx.getBean("emp");
		System.out.println(employee);
		//close the containers
		((AbstractApplicationContext) childCtx).close();
		((AbstractApplicationContext) parentCtx).close();
	}

}
