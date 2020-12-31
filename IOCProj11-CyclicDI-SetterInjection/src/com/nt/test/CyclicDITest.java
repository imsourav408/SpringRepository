package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.A;
import com.nt.comp.B;

public class CyclicDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Resource resource=null;
		A a=null;
		B b=null;
		try {
			//locate spring bean configuration file
			resource=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
			//create BeanFactory object by passing resource object
			factory=new XmlBeanFactory(resource);
			//get target bean object by passing bean id
			a=factory.getBean("a1",A.class);
			b=factory.getBean("b1",B.class);
			System.out.println(a);
			System.out.println(b);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
