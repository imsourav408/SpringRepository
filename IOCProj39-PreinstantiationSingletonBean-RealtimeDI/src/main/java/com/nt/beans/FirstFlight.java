package com.nt.beans;

public final class FirstFlight implements Courier{

	public FirstFlight() {
		System.out.println("FirstFlight_0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver()");
		return "FirstFlight courier will deliver oid: "+oid+" order products";
	}

}
