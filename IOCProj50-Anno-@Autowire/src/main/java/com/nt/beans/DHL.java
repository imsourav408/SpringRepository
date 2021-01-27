package com.nt.beans;

public final class DHL implements Courier{

	public DHL() {
		System.out.println("DTDC.0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return "DHL Courier will deliver  order id :: "+oid +" order  products";
	}
}
