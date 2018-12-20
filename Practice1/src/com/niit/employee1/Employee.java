package com.niit.employee1;

public class Employee {
	int empcode;
	String ename;
	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empcode, String ename) {
		//super();
		this.empcode = empcode;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", ename=" + ename + "]";
	}
	
}
