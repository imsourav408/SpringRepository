package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Voter;

public class SpringBeanLifeCycleTestBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Voter voter=null,voter1=null;
		//create factory object
		factory=new DefaultListableBeanFactory();
		//create reader object
		reader=new XmlBeanDefinitionReader(factory);
		//load the spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		voter=factory.getBean("voter",Voter.class);
		System.out.println(voter.checkVotingElgibility());
		voter1=factory.getBean("voter1",Voter.class);
		System.out.println(voter1.checkVotingElgibility());
		factory.destroySingletons();
	}

}
