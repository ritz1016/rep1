package com.niit.employee1;

public class Manager extends Employee{
	String qualification;
	public Manager() {}
	public Manager(int empcode, String ename, String qualification) {
		super(empcode, ename);
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		String s = "Manager [" + super.toString() + ", experience=" + qualification + "]";
		return s;
	}
	
}
