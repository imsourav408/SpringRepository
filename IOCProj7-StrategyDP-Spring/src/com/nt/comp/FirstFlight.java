package com.nt.comp;

public final class FirstFlight implements Courier{

	public FirstFlight() {
		System.out.println("FirstFlight.FirstFlight()");
	}
	
	@Override
	public String deliver(int oid) {
		return "FirstFlight Courier will deliver order id: "+oid+" order products";
	}
}
