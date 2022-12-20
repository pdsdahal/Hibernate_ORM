
package com.hibernatedemo.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.model.College;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFacotroy() {

		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void main(String[] args) throws IOException {
		
		SessionFactory sessionFactory  = SessionFactoryUtil.getSessionFacotroy();
		Session session =  sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		College college = new College();
		college.setCollegeName("Texas International College");
		college.setCollegeAddress("Mitrapark 1 Baneshowr");
		college.setCollegeEmail("texas@gmail.com");
		college.setCollegePhoneNo("2345678");
		college.setCollegeEstDate(new Date());
		
		String filePath = "F:\\GitShankar\\Hibernate_ORM\\Hibernate_ORM\\src\\test\\resources\\ADD.jpg";
		Path path = Paths.get(filePath);
		byte[] byteImageFile =  Files.readAllBytes(path);
		college.setCollegeLogo(byteImageFile);
		

		session.persist(college);
		transaction.commit();

		System.out.println("Data Saved Success");
		session.close();
	}
}