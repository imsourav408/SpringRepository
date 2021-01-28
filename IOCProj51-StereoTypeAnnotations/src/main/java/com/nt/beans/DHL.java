package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dhl")
@Lazy(true)
public final class DHL implements Courier{

	public DHL() {
		System.out.println("DHL.0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return "DHL Courier will deliver  order id :: "+oid +" order  products";
	}
}
