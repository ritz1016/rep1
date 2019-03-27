package com.niit.DAO;

import org.hibernate.Session;

import com.niit.model.Employer;
import com.niit.model.Job;



public interface EmployerDAO {
	
	public int save(Employer e);
	
	public int postJob(Job job);
	
	public void viewApplications(String Job_id);
	
}
