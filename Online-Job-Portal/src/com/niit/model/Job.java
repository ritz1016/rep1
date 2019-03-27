package com.niit.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Job")
@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findJobById",  
	        query = "from Job j where j.job_id = :job_id"  
	        )  
	    }  
	)  

public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="job_id")
	String job_id;
	@ManyToMany(targetEntity=Candidate.class, cascade={ CascadeType.ALL })
	@JoinTable(name = "applications", 
			joinColumns={ @JoinColumn(name="designation") },
			inverseJoinColumns={ @JoinColumn(name="name")})
	List<Candidate> jobseekers;
	String designation;
	String skills;
	int vacancy;
	String jobCatagory;
	String salary;
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL )
	Address location;
	String description;
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String job_id, String designation, String skills, int vacancy, String jobCatagory, String salary, Address location,
			String description) {
		super();
		this.job_id=job_id;
		this.designation = designation;
		this.skills = skills;
		this.vacancy = vacancy;
		this.jobCatagory = jobCatagory;
		this.salary = salary;
		this.location = location;
		this.description = description;
	}
	
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<Candidate> getJobseekers() {
		return jobseekers;
	}
	public void setJobseekers(List<Candidate> jobseekers) {
		this.jobseekers = jobseekers;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getVacancy() {
		return vacancy;
	}
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	public String getJobCatagory() {
		return jobCatagory;
	}
	public void setJobCatagory(String jobCatagory) {
		this.jobCatagory = jobCatagory;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "JobBean [designation=" + designation + ", skills=" + skills + ", vacancy=" + vacancy + ", jobCatagory="
				+ jobCatagory + ", salary=" + salary + ", location=" + location + ", description=" + description + "]";
	}
	
	
	
}
