package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessageGenerator;
import com.nt.sdp.Printer;
import com.nt.sdp.PrinterEnum;

public class SpringBeanScopeTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		WishMessageGenerator generator1=null,generator2=null,generator3=null,generator4=null;
		Printer printer1=null,printer2=null,printer3=null,printer4=null;
		PrinterEnum enum1=null,enum2=null;
		factory=new DefaultListableBeanFactory();
		//create reader class object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		generator1=factory.getBean("wmg1",WishMessageGenerator.class);
		generator2=factory.getBean("wmg1",WishMessageGenerator.class);
		System.out.println("(generator1==generator2)?"+(generator1==generator2));
		System.out.println("-----------------------------------------------------------------------------");
		generator3=factory.getBean("wmg2",WishMessageGenerator.class);
		generator4=factory.getBean("wmg2",WishMessageGenerator.class);
		System.out.println("(generator3==generator4)?"+(generator3==generator4));
		System.out.println("-----------------------------------------------------------------------------");
		printer1=factory.getBean("sdp1",Printer.class);
		printer2=factory.getBean("sdp1",Printer.class);
		System.out.println("(printer1==printer2)?"+(printer1==printer2));
		System.out.println("-----------------------------------------------------------------------------");
		printer3=factory.getBean("sdp2",Printer.class);
		printer4=factory.getBean("sdp2",Printer.class);
		System.out.println("(printer2==printer3)?"+(printer3==printer4));
		System.out.println("-----------------------------------------------------------------------------");
		enum1=factory.getBean("sdpe1",PrinterEnum.class);
		enum2=factory.getBean("sdpe1",PrinterEnum.class);
		System.out.println("(enum1==enum2)?"+(enum1==enum2));
		System.out.println("-----------------------------------------------------------------------------");
	}
}