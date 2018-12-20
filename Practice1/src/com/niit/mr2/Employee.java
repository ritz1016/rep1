package com.niit.mr2;

public class Employee {
	int id;
	String name;
	String designation;
	
	public Employee(){}
	public Employee(int id, String name, String Designation){
		this.id=id;
		this.name = name;
		this.designation = Designation;
	}
	public void setId(int i){
		id = i;
	}
	public int getId(){
		return id;
	}
	public void setName(String nm){
		name = nm;
	}
	public String getName(){
		return name;
	}
	public void setDesignation(String desg){
		designation = desg;
	}
	public String getDesignation(){
		return designation;
	}
	
	public String toString(){
		String s = "Employee[ID : "+id+", Name : "+name+", Designation : "+designation+"]";
		return s;
	}

}
