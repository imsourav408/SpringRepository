package com.nt.test;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Class<Date> c1=null;
		Calendar calendar=null;
		Connection con=null;
		String str1=null,str2=null;
		//create spring bean factory object
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		c1=factory.getBean("c1",Class.class);
		System.out.println("c1 obj class name::"+c1.getClass().getName()+"  c1 obj data::"+c1.toString());
		System.out.println("..............................................................");
		calendar=factory.getBean("cal",Calendar.class);
		System.out.println("calender obj class name::"+calendar.getClass().getName()+"  calender obj data::"+calendar.toString());
		System.out.println("..............................................................");
		con=factory.getBean("con",Connection.class);
		con.close();
		System.out.println("connection obj class name::"+con.getClass().getName()+"  connection obj data::"+con.toString());
		System.out.println("..............................................................");
		str1=factory.getBean("s2",String.class);
		System.out.println("str1 obj class name::"+str1.getClass().getName()+"  str1 obj data::"+str1.toString());
		System.out.println("..............................................................");
		str2=factory.getBean("sb2",String.class);
		System.out.println("str2 obj class name::"+str2.getClass().getName()+"  str2 obj data::"+str2.toString());
		System.out.println("..............................................................");
	}
}