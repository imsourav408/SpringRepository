package com.nt.sdp;

public enum PrinterEnum {
	INSTANCE;
	
	public static PrinterEnum getInstance() {
		return INSTANCE;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	
	PrinterEnum() {
		System.out.println("PrinterEnum.PrinterEnum()");
	}
}
