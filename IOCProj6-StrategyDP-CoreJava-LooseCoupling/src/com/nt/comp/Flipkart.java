package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	//property
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	//business method
	public String shopping(String[] items,float[] prices) {
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
