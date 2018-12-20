package com.niit.mr2.aggregation;

public class Address {
	int hno;
	String street;
	String city;
	String pin;
	public Address(){}
	public Address(int hno, String street, String city, String pin){
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public void setHno(int hno){
		this.hno = hno;
	}
	public int getHno(){
		return hno;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return street;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setPin(String pin){
		this.pin = pin;
	}
	public String getPin(){
		return pin;
	}
	public String toString(){
		return "[hno : "+hno+", street : "+street+", city : "+city+", pin : "+pin+"]";
	}

}
