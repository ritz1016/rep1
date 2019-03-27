package com.niit.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="jobseeker")
@Table(name="Jobseeker")
public class Candidate extends User{
	
	String name;
	String phone;
	@ElementCollection
	List<String> qualification = new ArrayList<String>();
	@ElementCollection
	List<String> skills= new ArrayList<String>();
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL )
	Address address;
	String dob;
	String yearOfPass;
	File resume;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(String name, String phone, List<String> qualification, List<String> skills,
			Address address, String dob, String yearOfPass, File resume) {
		super();
		this.name = name;
		this.phone = phone;
		this.qualification = qualification;
		this.skills = skills;
		this.address = address;
		this.dob = dob;
		this.yearOfPass = yearOfPass;
		this.resume = resume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<String> getQualification() {
		return qualification;
	}
	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getYearOfPass() {
		return yearOfPass;
	}
	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}
	public File getResume() {
		return resume;
	}
	public void setResume(File resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "JobSeeker [name=" + name + ", phone=" + phone + ", qualification=" + qualification + ", skills="
				+ skills + ", address=" + address + ", dob=" + dob + ", yearOfPass=" + yearOfPass + "]";
	}
	
	
}
