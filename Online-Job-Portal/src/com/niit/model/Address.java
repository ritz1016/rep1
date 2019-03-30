package com.niit.model;

import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {
	
	String locale;
	String district;
	String city;
	String state;
	String country;
	@Id
	String zipcode;
	
	@OneToOne(targetEntity=Job.class)
	private Job job;
	@OneToOne(targetEntity=Candidate.class)
	private Candidate candidate;
	@OneToOne(targetEntity=Employer.class)
	private Employer employer;
	
	
	//why constructor?????
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String locale, String district, String city, String state, String country, String zipcode) {
		super();
		this.locale = locale;
		this.district = district;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
	//wny to String()????
	@Override
	public String toString() {
		return "[locale=" + locale + ", district=" + district + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
	
	
}
