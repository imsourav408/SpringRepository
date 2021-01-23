package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonsInfo;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		PersonsInfo info=null;
		//create IOC container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		info=(PersonsInfo)context.getBean("pinfo");
		System.out.println(info);
		//close the container
		((AbstractApplicationContext) context).close();
	}
}
