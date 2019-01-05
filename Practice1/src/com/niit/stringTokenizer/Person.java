package com.niit.stringTokenizer;

public class Person {
	String name;
	String role;
	String email;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String role, String email) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
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
		return "Person [name=" + name + ", role=" + role + ", email=" + email + "]";
	}
	
}
