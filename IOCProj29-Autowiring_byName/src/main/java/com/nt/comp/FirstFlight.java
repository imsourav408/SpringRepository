package com.nt.comp;

public final class FirstFlight implements Courier {

	@Override
	public String deliver(int oid) {
		return "FirstFlight Courier will deliver order id: "+oid+" order products";
	}
}
