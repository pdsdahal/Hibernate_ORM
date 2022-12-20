package com.hibernatedemo.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernatedemo.model.College;
import com.hibernatedemo.service.CollegeService;
import com.hibernatedemo.util.SessionFactoryUtil;

public class CollgeServiceImpl implements CollegeService {

	SessionFactory sessionFactory;

	public CollgeServiceImpl() {
		sessionFactory = SessionFactoryUtil.getSessionFacotroy();
	}

	public int addCollege(College college) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(college);
		transaction.commit();
		session.close();
		return 1;
	}

	public int updateCollege(College college) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(college);
		transaction.commit();
		session.close();
		return 1;
	}

}
