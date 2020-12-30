package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart fpkt=null;
		try {
			fpkt=FlipkartFactory.getInstance("bluedart");
			System.out.println(fpkt.shopping(new String[] {"Rain coat","umbrella","flu tablets"},new float[] {4550.57f,2020.12f,500}));
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}//catch
	}//main
}//class
