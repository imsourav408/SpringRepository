package com.nt.comp;

import java.util.Date;

public class PersonsInfo {
	private long acno;
	private String pname;
	private Date dob;
	private Date doj;
	private Date dom;
	
	public PersonsInfo(long acno, String pname, Date dob, Date doj, Date dom) {
		System.out.println("PersonsInfo.PersonsInfo()");
		this.acno = acno;
		this.pname = pname;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonsInfo [acno=" + acno + ", pname=" + pname + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom
				+ "]";
	}
}