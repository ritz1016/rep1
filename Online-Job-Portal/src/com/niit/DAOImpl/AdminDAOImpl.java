package com.niit.DAOImpl;

import java.util.Scanner;//why this package???

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.DAO.AdminDAO;
import com.niit.DBConfig.HibernateUtil;
import com.niit.model.Admin;

public class AdminDAOImpl implements AdminDAO{
	
	
	
	public int register(Admin a){
		int res = 0;
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			t=session.beginTransaction();
			res=(Integer)session.save(a);
			t.commit();
		}
		catch(Exception e){
			if(t !=null){
				t.rollback();
			}
		}
		return res;
	}
}
