package com.niit.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="user")
public class User {
	@Id
	String userid;
	String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserBean [userid=" + userid + ", password=" + password + "]";
	}
	
	
}
