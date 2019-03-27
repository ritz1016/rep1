package com.niit.model;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="employer")

public class Employer extends User{
	
	
	String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="e_id")
	@OrderColumn(name="type")
	List<Job> jobs;
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL )
	Address address;
	String designation;
	boolean approval;
	String companyName;
	String reg_no;
	String companyType;
	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employer(String name, Address address, String designation, boolean approval, String companyName,
			String reg_no, String companyType) {
		super();
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.approval = approval;
		this.companyName = companyName;
		this.reg_no = reg_no;
		this.companyType = companyType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	public String getCompanyName() {
		return companyName;
	}
	public List<Job> getJobs() {
		return jobs;
	}
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	@Override
	public String toString() {
		return "EmployerBean [name=" + name + ", address=" + address + ", designation=" + designation + ", approval="
				+ approval + ", companyName=" + companyName + ", reg_no=" + reg_no + ", companyType=" + companyType
				+ "]";
	}
	
	
}
