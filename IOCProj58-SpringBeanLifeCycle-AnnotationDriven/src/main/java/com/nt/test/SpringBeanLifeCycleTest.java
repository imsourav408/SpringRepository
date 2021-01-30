package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Voter;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Voter voter=null;
		//create IOC container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target bean object
		voter=context.getBean("voter",Voter.class);
		System.out.println(voter.checkVotingElgibility());
		//close IOC container
		((AbstractApplicationContext) context).close();
	}

}
