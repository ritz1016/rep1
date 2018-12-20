package com.niit.mr2.aggregation;

public class Employee {
	int id;
	String name;
	String desg;
	Address address;
	public Employee(){}
	public Employee(int id, String name, String Designation, Address address){
		this.id=id;
		this.name = name;
		this.desg = Designation;
		this.address = address;
	}
	public void setId(int id){
		if (id<10){
			this.id = 10;
		}
		else{
			if(id>100){
				this.id = 100; 
			}
			else{
				this.id = id;
			}
		}
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setDesignation(String desg){
		this.desg = desg;
	}
	public String getDesignation(){
		return desg;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	public Address getAddress(){
		return address;
	}
	public String toString(){
		String s = "Employee[ID : "+id+", Name : "+name+", Designation : "+desg+", Address : "+address+"]";
		return s;
	}

}
