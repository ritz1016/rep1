package com.niit.DAOImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.DAO.EmployerDAO;
import com.niit.DBConfig.HibernateUtil;
import com.niit.model.Address;
import com.niit.model.Employer;
import com.niit.model.Job;
import com.niit.model.Candidate;

public class EmployerDAOImpl implements EmployerDAO{
	
	Scanner sc = new Scanner(System.in);
	
	public int save(Employer emp){

		int res = 0;
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			t=session.beginTransaction();
			res=(Integer)session.save(emp);
			t.commit();
		}
		catch(Exception e){
			if(t !=null){
				t.rollback();
			}
		}
		return res;
		
	}
	
	public int postJob(Job job){
		int res = 0;
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			t=session.beginTransaction();
			res=(Integer)session.save(job);
			t.commit();
		}
		catch(Exception e){
			if(t !=null){
				t.rollback();
			}
		}
		return res;
		
	}
	
	public void viewApplications(String job_id){
		Session s = HibernateUtil.getSessionFactory().openSession();
		TypedQuery query=s.getNamedQuery("findJobById");
		query.setParameter("name", job_id);
		List<Job> jobs = query.getResultList();
		Iterator<Job> itr_job = jobs.iterator();
		
		while(itr_job.hasNext()){
			Job job = itr_job.next();
			System.out.println(job);
			
			List<Candidate> js = job.getJobseekers();
			Iterator<Candidate> itr_js = js.iterator();
			while(itr_js.hasNext()){
				Candidate jobseeker = itr_js.next();
				System.out.println(jobseeker);
			}	
		}
		
	}

	
	
}
