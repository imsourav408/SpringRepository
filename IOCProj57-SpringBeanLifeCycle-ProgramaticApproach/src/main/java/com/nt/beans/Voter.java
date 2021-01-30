package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public final class Voter implements InitializingBean,DisposableBean{
	private String name;
	private Float age;
	private Date dov;
	
	public Voter() {
		System.out.println("Voter.Voter()");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	public void setDov(Date dov) {
		this.dov = dov;
	}
	
	//business method
	public String checkVotingElgibility() {
		System.out.println("Voter.checkVotingElgibility()");
		//b.logic
		if(age>=18)
			return  "Mr/Miss/Mrs."+name+ "  u  r  eglible for voting::"+age+"-->  on  ->"+dov;
		else
			return  "Mr/Miss/Mrs."+name+ "  u  r not  eglible for voting::"+age+"--> on->"+dov;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Voter.destroy()");
		//nullify bean properties
		dov=null;
		name=null;
		age=0.0f;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Voter.afterPropertiesSet()");
		dov=new Date();	 // initializing left over properties
		boolean flag=false;
		
		if(name==null){	// validation  logic
			System.out.println("Name must not be null");
			flag=true;
		}
		
		if(age<0)
			age=age*-1;	//correcting the values //Bean post processing
		
		if(age>100) {
			System.out.println("Age must not>100");
			flag=true;
		}
		
		if(flag)
			throw new IllegalArgumentException("Invalid inputs");
	}
}
