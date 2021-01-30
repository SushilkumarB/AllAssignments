package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDBConnection {

	public void insertEmployee() {
		Employee e = new Employee(14, "ABC", 91600);
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
		Query q = session.createQuery("From Employee where salary >90000");
		List l = q.list();
		System.out.println(l);

		


		tx.commit();
		
		session.save(e);

		session.close();
		factory.close();
		}
	
	
	
	

}
