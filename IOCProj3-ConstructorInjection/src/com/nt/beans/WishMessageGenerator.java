package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	//bean property
	private Date date;
	
	static {
		System.out.println("Wish message generator static block");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator_0-param constructor");
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator_1-param constructor");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	
	@SuppressWarnings("deprecation")
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage() date:==>"+date);
		int hour=0;
		String msg=null;
		//get current hour of the day
		hour=date.getHours();
		//generate wish message
		if(hour<12)
			msg="Good Morning "+user;
		else if(hour<16)
			msg="Good Afternoon "+user;
		else if(hour<20)
			msg="Good Evening "+user;
		else
			msg="Good Night "+user;
		
		return msg;
	}
}