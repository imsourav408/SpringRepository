package com.nt.bo;

public class PatientBO {
	private String pname;
	private String padd;
	private float fees;
	private int dayCount;
	private float totalAmt;
	
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
	public float getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}
	@Override
	public String toString() {
		return "PatientBO [pname=" + pname + ", padd=" + padd + ", fees=" + fees + ", dayCount=" + dayCount
				+ ", totalAmt=" + totalAmt + "]";
	}
}
