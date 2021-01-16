package com.nt.dto;

import java.io.Serializable;
import java.sql.Date;

public class StudentDTO implements Serializable{
	private static final long serialVersionUID=1l;
	
	private Integer sno;
	private String sname;
	private String sadd;
	private Date dob;
	private Float smark;
	private Float tmark;
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
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
	public Float getSmark() {
		return smark;
	}
	public void setSmark(Float smark) {
		this.smark = smark;
	}
	public Float getTmark() {
		return tmark;
	}
	public void setTmark(Float tmark) {
		this.tmark = tmark;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", dob=" + dob + ", smark=" + smark
				+ ", tmark=" + tmark + "]";
	}
}