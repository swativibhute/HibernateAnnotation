package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session =factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Student student = new Student();
		student.setId(102);
		student.setName("swara");
		student.setCity("pune");
		
		session.save(student);
	
		transaction.commit();
		session.close();
		System.out.println("Record inserted successfully.");
		//transaction.commit();
	}

}
