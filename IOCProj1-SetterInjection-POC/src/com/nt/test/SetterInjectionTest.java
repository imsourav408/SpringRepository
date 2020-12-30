package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main()");
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		String wishMessage=null;
		//hold name and location of spring bean configuration file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create BeanFactory IOC container
		factory=new XmlBeanFactory(res);
		//get WishMessageGenerator class object
		generator=(WishMessageGenerator)factory.getBean("wmg");
		//invoke business method
		wishMessage=generator.generateWishMessage("Sourav");
		//display wish message to the console
		System.out.println(wishMessage);
	}

}
