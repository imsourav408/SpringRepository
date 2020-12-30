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
		Random random=null;
		//calculate bill amount
		for(float price:prices)
			billAmt+=price;
		//generate order id as random number
		random=new Random();
		oid=random.nextInt(100000);
		//use courier service for delivering the product
		msg=courier.deliver(oid);
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" with bill amount "+billAmt+"---"+msg;
	}//shopping
	
}//class
