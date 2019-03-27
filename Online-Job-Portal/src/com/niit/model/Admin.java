package com.niit.model;

import javax.persistence.*;

@Entity
@Table(name="Admin")
@DiscriminatorValue("admin")
public class Admin extends User{
	
	String name;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
