package com.nt.vo;

public class PatientVO {
	private String pname;
	private String padd;
	private String fees;
	private String dayCount;
	
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
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getDayCount() {
		return dayCount;
	}
	public void setDayCount(String dayCount) {
		this.dayCount = dayCount;
	}
	@Override
	public String toString() {
		return "PatientVO [pname=" + pname + ", padd=" + padd + ", fees=" + fees + ", dayCount=" + dayCount + "]";
	}
}
