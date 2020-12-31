package com.nt.comp;

public class B {
	private A a;
	
	public B() {
		System.out.println("B_0-param constructor");
	}
	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a]";
	}	
}
