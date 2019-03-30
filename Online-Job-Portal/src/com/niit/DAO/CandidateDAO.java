//package name should be lower case
package com.niit.DAO;

import org.hibernate.Session;

import com.niit.model.Candidate;

public interface CandidateDAO {
	
	public int save(Candidate c);
	
	//why session objectpass in viewJobOpening()???
	public void viewJobOpenings(Session s);
	
	
}
