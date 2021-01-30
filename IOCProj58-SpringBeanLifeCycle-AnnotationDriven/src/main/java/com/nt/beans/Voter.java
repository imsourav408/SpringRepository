package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public final class Voter {
	@Value("Sourav Kumar Nayak")
	private String name;
	@Value("22")
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
	
	// init life cycle method /custom life cycle method
	@PostConstruct
	public void myInit() {
		System.out.println("Voter.myInit()");
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
	
	// destroy life cycle method/custom destroy method
	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		//nullify bean properties
		dov=null;
		name=null;
		age=0.0f;
	}
}
