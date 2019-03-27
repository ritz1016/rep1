package com.niit.DAOImpl;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.Session;

import com.niit.DAO.JobDAO;
import com.niit.model.Candidate;
import com.niit.model.Job;

public class JobDaoImpl implements JobDAO {

	@Override
	public void addCandidate(Candidate c) {
		// TODO Auto-generated method stub
		Job j = new Job();
		List<Candidate> applicant = new ArrayList<Candidate>();
		applicant.add(c);
		j.setJobseekers(applicant);
		
	}

}
