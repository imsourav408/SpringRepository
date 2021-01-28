package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component(value = "fpkt")
@Component
@Scope("prototype")
public final class Flipkart {
	@Autowired(required = false)
	//@Qualifier("b1")
	@Qualifier("dtdc")
	private Courier courier;
	
	/*
	 //Any type of auto wiring is not possible in static fields
	@Autowired
	private static Date sysDate;
	*/
	
	@Autowired
	private Date sysDate;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}
	
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
