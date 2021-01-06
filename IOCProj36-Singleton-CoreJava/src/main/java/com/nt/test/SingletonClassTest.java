package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonClassTest {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		//create printer class object
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		System.out.println("P1:"+p1.hashCode()+"    "+"P2"+p2.hashCode());
		System.out.println("(P1==P2)? "+(p1==p2));
		p1.printMsg("Good Evening Sourav");
		p2.printMsg("Good Evening Raja");
	}
}
