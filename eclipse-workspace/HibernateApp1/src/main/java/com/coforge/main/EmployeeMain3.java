package com.coforge.main;

import javax.persistence.Query;

import org.hibernate.Session;

public class EmployeeMain3 {
	public static void main(String[] args) {
		Sessionfactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Query namedQuery = session.createNamedQuery("allemp");
		System.out.println("named query ");
		namedQuery.getResultList().forEach(p -> System.out.println(p));
		Query namedQuery1 = session.createNamedQuery("empbyid");
		namedQuery1.setParameter(1, 8);
		System.out.println(" named query 2 ");
		namedQuery1.getresult
	}

}
