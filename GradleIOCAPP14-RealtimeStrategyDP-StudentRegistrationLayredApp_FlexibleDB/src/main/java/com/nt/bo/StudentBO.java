package com.nt.bo;

import java.sql.Date;

public class StudentBO {
	
	private String sname;
	private String sadd;
	private Date dob;
	private float smark;
	private float tmark;
	private float cgpa;
	
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public float getSmark() {
		return smark;
	}
	public void setSmark(float smark) {
		this.smark = smark;
	}
	public float getTmark() {
		return tmark;
	}
	public void setTmark(float tmark) {
		this.tmark = tmark;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "StudentBO [sname=" + sname + ", sadd=" + sadd + ", dob=" + dob + ", smark=" + smark + ", tmark=" + tmark
				+ ", cgpa=" + cgpa + "]";
	}	
}
