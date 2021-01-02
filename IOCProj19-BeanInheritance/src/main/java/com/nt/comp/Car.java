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
	
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getEngNo() {
		return engNo;
	}
	public void setEngNo(String engNo) {
		this.engNo = engNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engNo=" + engNo + ", model=" + model + ", company=" + company + ", type="
				+ type + ", engineCC=" + engineCC + ", owner=" + owner + ", colour=" + colour + ", fuelType=" + fuelType
				+ "]";
	}	
}
