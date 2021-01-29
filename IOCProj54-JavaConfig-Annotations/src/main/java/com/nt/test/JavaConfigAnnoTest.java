package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class JavaConfigAnnoTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Flipkart flipkart=null;
		//create IOC container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		flipkart=context.getBean(Flipkart.class);
		//invoke the methods
		System.out.println(flipkart.shopping(new String[] {"PPEKit"," MASK","Sanitizer"},new float[] {2000,500,200}));
		//close IOC container
		((AbstractApplicationContext) context).close();
	}

}
