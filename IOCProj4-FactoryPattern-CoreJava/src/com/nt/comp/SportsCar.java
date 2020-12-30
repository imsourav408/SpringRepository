package com.nt.comp;

public class SportsCar implements Car{

	private Tyre tyre;
	
	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar.SportsCar()");
		this.tyre=tyre;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving Sports Car having "+tyre.roadGrip());
	}
}
