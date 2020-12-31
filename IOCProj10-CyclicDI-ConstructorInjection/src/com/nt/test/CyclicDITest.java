package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Resource res=null;
		A a=null;
		B b=null;
		try {
			//locate the spring bean configuration file
			res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
			//create BeanFactory object by passing resouce object
			factory=new XmlBeanFactory(res);
			//get target class object by passing bean id
			a=factory.getBean("a1", A.class);
		//	b=factory.getBean("b1",B.class);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}//main
}//class
