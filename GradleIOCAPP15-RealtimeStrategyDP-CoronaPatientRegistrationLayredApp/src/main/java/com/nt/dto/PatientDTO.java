package com.nt.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String pname;
	private String padd;
	private float fees;
	private int dayCount;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public int getDayCount() {
		return dayCount;
	}
	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}
	@Override
	public String toString() {
		return "PatientDTO [pname=" + pname + ", padd=" + padd + ", fees=" + fees + ", dayCount=" + dayCount + "]";
	}
}
