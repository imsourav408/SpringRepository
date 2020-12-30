package com.nt.comp;

public final class DTDC implements Courier{

	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}
	
	@Override
	public String deliver(int oid) {	
		return "DTDC Courier will deliver order id: "+oid+" order products";
	}
}
