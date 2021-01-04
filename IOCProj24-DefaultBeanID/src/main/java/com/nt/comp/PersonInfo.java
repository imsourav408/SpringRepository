package com.nt.comp;

import java.util.Date;

public final class PersonInfo {
	private String pname;
	private String age;
	private long adharNo;
	private String padd;
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	
	@Override
	public String toString() {
		return "PersonInfo [pname=" + pname + ", age=" + age + ", adharNo=" + adharNo + ", padd=" + padd + "]";
	}
	
}
