package com.nt.test;

import com.nt.sdp.PrinterEnum;

public class SingletonEnumTest {

	public static void main(String[] args) {
		PrinterEnum p1=null,p2=null;
		//create PrinterEnum Object
		p1=PrinterEnum.INSTANCE;
		p2=PrinterEnum.INSTANCE;
		System.out.println("(p1==p2)? "+(p1==p2));
		System.out.println("P1: "+p1.hashCode()+" P2: "+p2.hashCode());
		p1.printMsg("Hello");
		p2.printMsg("Hii");
		System.out.println(PrinterEnum.INSTANCE.hashCode()+"  "+PrinterEnum.INSTANCE.getClass());
	}

}
