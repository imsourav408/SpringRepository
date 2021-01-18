package com.nt.beans;

import java.util.Date;

public final class Employee {
	private Integer eno;
	private String ename;
	private String job;
	private Date doj;
	
	public Employee(Integer eno, String ename, String job, Date doj) {
		System.out.println("Employee.0-param_Constructor");
		this.eno = eno;
		this.ename = ename;
		this.job = job;
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", doj=" + doj + "]";
	}
}
