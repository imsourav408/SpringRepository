package com.nt.comp;

import java.util.Date;

public final class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
		this.date = date;
	}
	
	@SuppressWarnings("deprecation")
	public String generateWishMsg(String user) {
		int hour=0;
		String msg=null;
		hour=date.getHours();
		if(hour<12)
			msg="Goood Morning: "+user;
		else if(hour<16)
			msg="Good Afternoon: "+user;
		else if(hour<20)
			msg="Good Evening: "+user;
		else
			msg="Good Night: "+user;
		return msg;
	}
}