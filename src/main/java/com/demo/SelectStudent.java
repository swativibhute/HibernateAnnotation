package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class SelectStudent {

	public static void main(String[] args) {


		Configuration  configuration = new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("from Student");
		List< Student> list = query.list();
		for (Student student : list) {
			System.out.println("Id>>" + student.getId());
			System.out.println("Name >> "+student.getName());
			System.out.println("city >>" + student.getCity());
		}
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Record retrieved successfully.");
		
	}

}
