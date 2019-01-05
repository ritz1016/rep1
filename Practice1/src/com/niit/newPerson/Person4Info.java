package com.niit.newPerson;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person4Info implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4079187536496342011L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	String name;
	String role;
	String email;
	Date dob;
	public Person4Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person4Info(String name, String role, String email, Date dob) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
		this.dob = dob;
	}
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE dd MMMM''yy");
	public String getDob() {
		return sdf.format(dob);
	}
	public void setDob(String dob)throws ParseException {
//		try{
			this.dob = sdf.parse(dob);
//		}
//		catch(ParseException e){
//			System.out.println(e);
//		}
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", role=" + role + ", email=" + email + ", dob=" + sdf2.format(dob) + "]";
	}
	
		
	public String toCSV(){
		return name + "," + role+ "," +email+ "," +sdf2.format(dob)+"\n";
	}
	
}
