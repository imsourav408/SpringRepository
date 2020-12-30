package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart fpkt=null;
		try {
			//get target class object using factory
			fpkt=FlipkartFactory.getInstance();
			//invoke business method
			System.out.println(fpkt.shopping(new String[] {"Rain coat","umbrella","flu tablets"},new float[] {5000,2000,500}));
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
	}//main
}//class
