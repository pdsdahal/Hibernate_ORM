package com.hibernatedemo.client;

import java.io.IOException;
import java.util.List;

import com.hibernatedemo.model.College;
import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateSelectsExecutionDemo {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();
		
		System.out.println("Fetch all colleges : ");
		List<College> lstColeges = collegeImplObj.getColleges();
		for(College college :  lstColeges) {
			System.out.println("Id : " + college.getCollegeId() + " Name : "+college.getCollegeName());
			System.out.println("Country Name : "+college.getAddress().getCountryName() + " Province Name : "+college.getAddress().getProvinceName()+"\n");			
		}
		
	}

}
