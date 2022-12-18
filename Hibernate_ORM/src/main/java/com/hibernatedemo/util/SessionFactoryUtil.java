package com.hibernatedemo.util;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.model.College;

public class SessionFactoryUtil {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		College college = new College();
		college.setCollegeName("Texas International College");
		college.setCollegeAddress("Mitrapark 1 Baneshowr");
		college.setCollegeEmail("texas@gmail.com");
		college.setCollegePhoneNo("2345678");
		college.setCollegeEstDate(new Date());
		
		session.persist(college);
		transaction.commit();
		
		System.out.println("Data Saved Success");
		session.close();
	}
}