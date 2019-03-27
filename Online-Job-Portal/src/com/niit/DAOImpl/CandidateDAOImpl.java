package com.niit.DAOImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.DAO.CandidateDAO;
import com.niit.DBConfig.HibernateUtil;
import com.niit.model.Address;
import com.niit.model.Job;
import com.niit.model.Candidate;

public class CandidateDAOImpl implements CandidateDAO{
	
	Scanner sc = new Scanner(System.in);
	
	public int save(Candidate c){
		
		int res = 0;
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			t=session.beginTransaction();
			res=(Integer)session.save(c);
			t.commit();
		}
		catch(Exception e){
			if(t !=null){
				t.rollback();
			}
		}
		return res;	
	
	}
	
	public void viewJobOpenings(Session s){
		
		Query query=s.createQuery("from Jobs");
		List<Job> jobs = query.getResultList();
		Iterator<Job> itr_job = jobs.iterator();
		
		while(itr_job.hasNext()){
			Job job = itr_job.next();
			System.out.println(job);
			
		}
			
	}
	
	
	
	
	
	
	
}
