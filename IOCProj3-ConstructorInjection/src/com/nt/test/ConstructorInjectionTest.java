package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		Resource resource=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		String msg=null;
		// Hold spring bean cfg file name and location
	//	resource=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");	//relative location
		//absolute location
	//	resource=new FileSystemResource("D:\\SpringFramework\\IOCProj3-ConstructorInjection\\src\\com\\nt\\cfgs\\applicationContext.xml");
		resource=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//first add com/nt/cfgs folder to class path then test
	//	resource=new ClassPathResource("applicationContext.xml");
		//create spring bean factory object
		factory=new XmlBeanFactory(resource);
		//get target bean object
	//	generator=(WishMessageGenerator)factory.getBean("wmg");
		//without type casting use another overloaded getBean factory method
		generator=factory.getBean("wmg",WishMessageGenerator.class);
		//invoke business method
		msg=generator.generateWishMessage("Sourav");
		System.out.println(msg);
	}
}
