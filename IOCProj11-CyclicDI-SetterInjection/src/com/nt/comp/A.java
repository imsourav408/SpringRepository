package com.nt.comp;

public class A {
	private B b;
	
	public A() {
		System.out.println("A_0-param constructor");
	}
	
	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b]";
	}
}
