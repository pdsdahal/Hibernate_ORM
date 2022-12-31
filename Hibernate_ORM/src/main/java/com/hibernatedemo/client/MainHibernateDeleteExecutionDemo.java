package com.hibernatedemo.client;

import java.io.IOException;

import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateDeleteExecutionDemo {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();

		int resultDelete = collegeImplObj.deleteCollge(2);
		if (resultDelete >= 1) {
			System.out.println("Data Deleted Successfully!");
		} else {
			System.out.println("Failed to delete!");
		}

	}

}
