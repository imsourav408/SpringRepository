package com.nt.beans;

import java.util.Date;

public class Employee {
	private String ename;
	private Date dob;
	private Date dom;
	private Date doj;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", dob=" + dob + ", dom=" + dom + ", doj=" + doj + "]";
	}	
}
