package com.nt.comp;

public class LuxoryCar implements Car{

	private Tyre tyre;
	
	public LuxoryCar(Tyre tyre) {
		System.out.println("LuxoryCar.LuxoryCar()");
		this.tyre=tyre;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving Luxory Car having "+tyre.roadGrip());
	}
}
