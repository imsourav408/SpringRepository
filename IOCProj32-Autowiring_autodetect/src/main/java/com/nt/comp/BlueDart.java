package com.nt.comp;

public final class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		return "BlueDart Courier will deliver order id: "+oid+" order products";
	}
}
