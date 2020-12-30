package com.nt.comp;

public final class BlueDart implements Courier{

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	
	@Override
	public String deliver(int oid) {	
		return "BlueDart Courier will deliver order id: "+oid+" order products";
	}
}
