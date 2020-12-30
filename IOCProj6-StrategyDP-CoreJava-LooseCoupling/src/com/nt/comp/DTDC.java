package com.nt.comp;

public final class DTDC implements Courier{

	@Override
	public String deliver(int oid) {	
		return "DTDC Courier will deliver order id: "+oid+" order products";
	}
}
