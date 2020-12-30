package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StrategyDPTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart flipkart=null;
		Resource res=null;
		try {
			//locate spring bean configuration file
			res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
			//create BeanFactory implement class object
			factory=new XmlBeanFactory(res);
			//get target class object
			flipkart=factory.getBean("fpkt",Flipkart.class);
			//invoke business method
			System.out.println(flipkart.shopping(new String[]{"watch","phone","headphone"},new float[]{27300.55f,120000.00f,7321.23f}));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
