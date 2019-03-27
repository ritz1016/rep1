package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CustomDAOImpl {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	
	public void commit(){
		t.commit();
		factory.close();
		session.close();
	}
	public void rollback(){
		t.rollback();
		factory.close();
		session.close();
	}
	
}
