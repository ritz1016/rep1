package com.niit.employee1;

public class Supervisor extends Employee{
	int Experience;
	public Supervisor() {}
	
	public Supervisor(int empcode,String ename,  int experience) {
		super(empcode, ename);
		Experience = experience;
	}
	
	@Override
	public String toString() {
		String s = "Supervisor [" + super.toString()+ ", Experience=" + Experience + "]";
		return s;
	}
	

}
