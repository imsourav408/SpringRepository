package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	@Autowired(required = false)
	@Qualifier("b1")
	//@Qualifier("dtdc")
	private Courier courier;
	@Autowired
	private Date sysDate;
	
	/*
	@Autowired(required = true)
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}*/
	
/*	
	@Autowired(required = false)
	public Flipkart(@Qualifier("dtdc")Courier courier) {
		System.out.println("Flipkart.Flipkart(courier)");
		this.courier = courier;
	}*/
	
/*	
	@Autowired
	public Flipkart(Date sysDate) {
		System.out.println("Flipkart.Flipkart(sysDate)");
		this.sysDate = sysDate;
	}*/
	
/*
	@Autowired(required = false)
	public Flipkart(@Qualifier("dtdc")Courier courier, Date sysDate) {
		System.out.println("Flipkart.Flipkart(-,-)");
		this.courier = courier;
		this.sysDate = sysDate;
	}*/
/*
	//Auto wiring using setter method
	@Autowired
	@Qualifier("b1")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	@Autowired
	public void setSysDate(Date sysDate) {
		System.out.println("Flipkart.setSysDate()");
		this.sysDate = sysDate;
	}
*/

	/*
	//Auto wiring using arbitrary method
	@Autowired
	@Qualifier("dtdc")
	public void assign(Courier courier) {
		System.out.println("Flipkart.assign()");
		this.courier=courier;
	}*/

	//b.method
	public  String  shopping(String[] items,float[] prices) {
		System.out.println("Flipkart.shopping():::"+sysDate);
		 float billAmt=0.0f;
		 int oid=0;
		 String msg=null;
		 Random rad=null;
		//calculate  bill Amount
		 
		 for(float p:prices) 
			// billAmt=billAmt+p;
			 billAmt+=p;
		 //generate  order id dynamically as random number
		 rad=new Random();
		 oid= rad.nextInt(10000);
		 // use courier service for delivering the  products
		 msg=courier.deliver(oid);
		 // retrun bill Amt and courier details to customer
		return  Arrays.toString(items)+" are purchased  having prices "+Arrays.toString(prices)+"  with bill amount"+billAmt+ "----"+ msg;
	}
}
