package com.nt.beans;

public final class Arithmatic {
	private Addition addition;
	
	public Arithmatic() {
		System.out.println("Arithmatic.Arithmatic()");
	}
	public void setAddition(Addition addition) {
		this.addition = addition;
	}
	
	public void addTwoNum(int a,int b) {
		System.out.println("The addition result is: "+addition.sum(a, b));
	}
}