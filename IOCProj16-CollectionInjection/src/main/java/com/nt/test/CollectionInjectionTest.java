package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.College;
import com.nt.beans.ContactInfo;
import com.nt.beans.FruitsInfo;
import com.nt.beans.MarksInfo;
import com.nt.beans.UniversityInfo;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MarksInfo info=null;
		College clg=null;
		ContactInfo contactInfo=null;
		UniversityInfo universityInfo=null;
		FruitsInfo fruitsInfo=null;
		//create bean factory
		factory=new DefaultListableBeanFactory();
		//create reader object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean objects
		info=factory.getBean("mi",MarksInfo.class);
		System.out.println(info);
		System.out.println("--------------------------------------------------------");
		clg=factory.getBean("clg",College.class);
		System.out.println(clg);
		System.out.println("--------------------------------------------------------");
		contactInfo=factory.getBean("cinfo",ContactInfo.class);
		System.out.println(contactInfo);
		System.out.println("--------------------------------------------------------");
		universityInfo=factory.getBean("uinfo",UniversityInfo.class);
		System.out.println(universityInfo);
		System.out.println("--------------------------------------------------------");
		fruitsInfo=factory.getBean("fruit",FruitsInfo.class);
		System.out.println(fruitsInfo);
	}//main
}//class