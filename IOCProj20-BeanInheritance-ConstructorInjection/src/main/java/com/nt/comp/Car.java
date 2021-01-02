package com.nt.comp;

public class Car {
	private String regNo;
	private String engNo;
	private String model;
	private String company;
	private String type;
	private int engineCC;
	private String owner;
	private String colour;
	private String fuelType;
	
	public Car(String regNo, String engNo, String model, String company, String type, int engineCC, String owner,
			String colour, String fuelType) {
		System.out.println("Car.Car()");
		this.regNo = regNo;
		this.engNo = engNo;
		this.model = model;
		this.company = company;
		this.type = type;
		this.engineCC = engineCC;
		this.owner = owner;
		this.colour = colour;
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engNo=" + engNo + ", model=" + model + ", company=" + company + ", type="
				+ type + ", engineCC=" + engineCC + ", owner=" + owner + ", colour=" + colour + ", fuelType=" + fuelType
				+ "]";
	}
}
