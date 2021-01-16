package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart_0-param constructor");
	}
	
	public Flipkart(Courier courier) {
		System.out.println("Flipkart_1-param constructor");
		this.courier=courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String shopping(String items[],float prices[]) {
		System.out.println("Flipkart.shopping()");
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		Random rad=null;
		//calculate bill amount
		for(float price:prices)
			billAmt+=price;
		//generate random order id
		rad=new Random();
		oid=rad.nextInt(10000);
		//use courier services for delivering the product
		msg=courier.deliver(oid);
		// retrun bill Amt and courier details to customer
		return  Arrays.toString(items)+" are purchased  having prices "+Arrays.toString(prices)+"  with bill amount"+billAmt+ "----"+ msg;
	}
}