package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session =factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student student2 =(Student)session.get(Student.class, 101);
		student2.setName("swati");
		session.update(student2);
		
		session.getTransaction().commit();
		
		session.close();
		System.out.println("Record updated successfully.");
		//transaction.commit();
	}

}
