package com.niit.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.niit.DAO.AdminDAO;
import com.niit.DAO.CandidateDAO;
import com.niit.DAO.EmployerDAO;
import com.niit.DAO.JobDAO;
import com.niit.DAOImpl.CandidateDAOImpl;
import com.niit.DAOImpl.EmployerDAOImpl;
import com.niit.DAOImpl.JobDaoImpl;
import com.niit.DBConfig.HibernateUtil;
import com.niit.model.Address;
import com.niit.model.Candidate;
import com.niit.model.Employer;
import com.niit.model.Job;

public class MainMethodClass {

	 static SessionFactory sessionFactory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		try{
			sessionFactory=HibernateUtil.getSessionFactory();	
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		/*
		Address add_emp = new Address("Charu Chandra place", "Tollygunge", "Kolkata", "West Bengal", "India", "700033");
		Address add_can = new Address("Camac Street", "Howrah", "Howrah", "West Bengal", "India", "700009");
		Address add_job = new Address("Hi-Tech Colony", "Birati", "Gandhinagar", "Gujrat", "India", "549964");
		
		Employer emp = new Employer("Larry Page", add_emp, "CEO", true, "Google", "18121662181", "Search Engine");
		Job job = new Job("J101", "Assistant Web Designer", "Servlet, Jsp, Maven", 10, "Web Designer", "60,000 p.a.", add_job, "Your job is to maintain and update a given web page.");
		List<String> qualification = new ArrayList<String>();
		qualification.add("B.Tech in computer science Engineering with 75%");
		qualification.add("10+2 from Science Stream with 80%");
		qualification.add("10 with 85%");
		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("html");
		skills.add("jsp");
		skills.add("servlet");
		skills.add("hibernate");
		File resume = new File("C:\\Users\\Ritesh\\Documents\\WORK\\cv to send\\Ritesh Chatterjee.pdf");
		Candidate candidate = new Candidate("Ritesh Chatterjee", "7908258988", qualification, skills, add_can, "11-06-1995", "2017", resume);
		
		
		EmployerDAO e = new EmployerDAOImpl();
		CandidateDAO c = new CandidateDAOImpl();
		JobDAO j = new JobDaoImpl();
		
		System.out.println(emp);
		System.out.println(job);
		System.out.println(candidate);
		
		System.out.println(e.save(emp));
		System.out.println(e.postJob(job));
		System.out.println(c.save(candidate));
		j.addCandidate(candidate);
		*/
		
	}

}
