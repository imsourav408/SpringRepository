package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.WishMessageGenerator;

public class BeanAliasNameTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		WishMessageGenerator generator1=null,generator2=null,
				generator3=null,generator4=null,generator5=null,
				generator6=null,generator7=null,generator8=null,generator9=null;
		//create object for bean factory
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean objects
		generator1=factory.getBean("WishMsgGen",WishMessageGenerator.class);
		System.out.println(generator1.generateWishMsg("Sourav"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator2=factory.getBean("wmg1",WishMessageGenerator.class);
		System.out.println(generator2.generateWishMsg("Raja"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator3=factory.getBean("wmg2",WishMessageGenerator.class);
		System.out.println(generator3.generateWishMsg("Banty"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator4=factory.getBean("msg1",WishMessageGenerator.class);
		System.out.println(generator4.generateWishMsg("Krishna"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator5=factory.getBean("msg2",WishMessageGenerator.class);
		System.out.println(generator5.generateWishMsg("Goodly"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator6=factory.getBean("msg3",WishMessageGenerator.class);
		System.out.println(generator6.generateWishMsg("Pinky"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator7=factory.getBean("msg4",WishMessageGenerator.class);
		System.out.println(generator7.generateWishMsg("Gungun"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator8=factory.getBean("com.nt.comp.WishMessageGenerator",WishMessageGenerator.class);
		System.out.println(generator8.generateWishMsg("Aditya"));
		System.out.println("---------------------------------------------------------------------------------------------");
		generator9=factory.getBean("msg5",WishMessageGenerator.class);
		System.out.println(generator9.generateWishMsg("Shruti"));
	}//main
}//class