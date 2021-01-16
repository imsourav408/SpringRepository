package com.nt.beans;

public final class BlueDart implements Courier{

	public BlueDart() {
		System.out.println("BlueDart_0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart courier will deliver oid: "+oid+" order products";
	}

}
