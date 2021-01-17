package com.nt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Locale locale=null;
		String cap1=null,cap2=null,cap3=null,cap4=null;
		//create IOC container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//prepare locale object
		locale=new Locale(args[0], args[1]); //args[0] ->language  , args[1] -> country
		//get messages
		cap1=context.getMessage("btn1.cap", new String[] {"student"} ,"msg1", locale);
		cap2=context.getMessage("btn2.cap", null, "msg2",locale);
		cap3=context.getMessage("btn3.cap", null, "msg3",locale);
		cap4=context.getMessage("btn4.cap", null,"msg4", locale);
		System.out.println(cap1+"  "+cap2+"  "+cap3+"  "+cap4);
		System.out.println(context.getMessage("btn2.cap", null, new Locale("de","DE")));
		System.out.println(context.getMessage("btn2.cap", null, new Locale("hi","IN")));
		System.out.println(context.getMessage("btn2.cap", null, new Locale("x","y")));
		//close the container
		((AbstractApplicationContext)context).close();
	}
}
