package com.coforge.dao;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;

public class EmployeeDao {
	SessionFactory factory;
	Transaction transaction;
	Session session;
	
	public EmployeeDao() {
	factory=MySessionFactory.getSessionFactory();
	session=factory.openSession();
	}
	
	public boolean addEmployee(Employee emp) {
		transaction=session.getTransaction();
		session.save(emp);
		transaction.commit();
		return true;
	}
	
}
