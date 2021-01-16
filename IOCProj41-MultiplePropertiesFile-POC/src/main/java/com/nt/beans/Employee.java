package com.nt.beans;

public final class Employee {
	private String ename;
	private String job;
	private Double sal;
	private String location;
	
	public Employee() {
		System.out.println("Employee_0-param constructor");
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", job=" + job + ", sal=" + sal + ", location=" + location + "]";
	}
}
