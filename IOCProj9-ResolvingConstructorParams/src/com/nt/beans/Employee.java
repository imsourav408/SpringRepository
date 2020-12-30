package com.nt.beans;

public class Employee {
	private int eno;
	private String ename;
	private float sal;
	
	public Employee(int eno, String ename, float sal) {
		System.out.println("Employee: 3-param constructors");
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	} 
}
