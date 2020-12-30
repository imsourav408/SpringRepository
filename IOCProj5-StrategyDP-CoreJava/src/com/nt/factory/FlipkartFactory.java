package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FirstFlight;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getInstance(String courierName) {
		Flipkart fpkt=null;
		Courier courier=null;
		//create dependent class object
		if(courierName.equalsIgnoreCase("DTDC"))
			courier=new DTDC();
		else if(courierName.equalsIgnoreCase("BLUEDART"))
			courier=new BlueDart();
		else if(courierName.equalsIgnoreCase("FIRSTFLIGHT"))
			courier=new FirstFlight();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		//create target class object
		fpkt=new Flipkart();
		//assign target class object to dependent class
		fpkt.setCourier(courier);
		//return target class object
		return fpkt;
	}//getInstance
}//class
