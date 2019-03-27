package com.niit.DAO;

import org.hibernate.Session;

import com.niit.model.Candidate;

public interface CandidateDAO {
	
	public int save(Candidate c);
	
	public void viewJobOpenings(Session s);
	
}
