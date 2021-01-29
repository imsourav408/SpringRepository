package com.nt.comp;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("fpkt")
public final class Flipkart {
	//property
	@Resource(name = "bdart")
	private Courier courier;
	
	@Resource
	private Date sysDate;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	//business method
	public String shopping(String[] items,float[] prices) {
		System.out.println("Flipkart.shopping(-,-)"+sysDate);
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		Random rad=null;
		//calculate the bill amount
		for(float price:prices)
			billAmt+=price;
		//generate order id dynamically as random number
		rad=new Random();
		oid=rad.nextInt(100000);
		//use courier service for delivering the product
		msg=courier.deliver(oid);
		//return bill amount and courier details to customer
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" with bill amount "+billAmt+"---"+msg;
	}//shopping
}//class
