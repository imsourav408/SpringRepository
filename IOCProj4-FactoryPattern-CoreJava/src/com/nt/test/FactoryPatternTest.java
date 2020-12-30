package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Car car1=null,car2=null,car3=null;
		car1=CarFactory.getInstance("luxory");
		car1.drive();
		System.out.println("-------------------------------------------------");
		car2=CarFactory.getInstance("budget");
		car2.drive();
		System.out.println("-------------------------------------------------");
		car3=CarFactory.getInstance("sports");
		car3.drive();
	}//main
}//class
