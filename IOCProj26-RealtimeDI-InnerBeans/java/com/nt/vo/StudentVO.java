package com.nt.vo;

public class StudentVO {
	private String sname;
	private String sadd;
	private String dob;
	private String smark;
	private String tmark;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSmark() {
		return smark;
	}
	public void setSmark(String smark) {
		this.smark = smark;
	}
	public String getTmark() {
		return tmark;
	}
	public void setTmark(String tmark) {
		this.tmark = tmark;
	}
	
	@Override
	public String toString() {
		return "StudentVO [sname=" + sname + ", sadd=" + sadd + ", dob=" + dob + ", smark=" + smark + ", tmark=" + tmark
				+ "]";
	}	
}
