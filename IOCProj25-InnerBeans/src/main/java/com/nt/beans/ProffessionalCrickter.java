package com.nt.beans;

public final class ProffessionalCrickter {
	private String name;
	private Bat bat;
	
	public ProffessionalCrickter(String name, Bat bat) {
		System.out.println("ProffessionalCrickter.ProffessionalCrickter()");
		this.name = name;
		this.bat = bat;
	}
	
	public String batting() {
		int runs=0;
		runs=bat.scoreRuns();
		return "Batsman::"+name+"  has scored :: "+runs +"  runs"; 
	}
}