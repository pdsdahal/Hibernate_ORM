package com.hibernatedemo.client;

import java.io.IOException;

import com.hibernatedemo.model.College;
import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateSelectExecutionDemo {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();

		//Get Single college
		College college1 = collegeImplObj.getCollege(1);
		System.out.println("Id : " + college1.getCollegeId());
		System.out.println("Name : " + college1.getCollegeName());
		System.out.println("Country Name : "+college1.getAddress().getCountryName());
		System.out.println("Province Name : "+college1.getAddress().getProvinceName());
		
		
	}

}
