package com.niit.newPerson;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person4Variable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5266434577160390956L;
	String name;
	String role;
	String email;
	Date dob;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE dd MMMM''yy");
	
	public Person4Variable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person4Variable(String name, String role, String email, Date dob) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return sdf.format(dob);
	}
	public void setDob(String dob) throws ParseException {
		this.dob = sdf.parse(dob);
	}
	@Override
	public String toString() {
		return "Person4Variable [name=" + name + ", role=" + role + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
}
