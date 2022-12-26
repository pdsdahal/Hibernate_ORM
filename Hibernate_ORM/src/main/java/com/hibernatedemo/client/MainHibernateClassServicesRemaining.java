package com.hibernatedemo.client;

import java.io.IOException;
import java.util.List;

import com.hibernatedemo.model.College;
import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateClassServicesRemaining {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();

		/*
		 * //delete
		 * 
		 * int resultDelete = collegeImplObj.deleteCollge(2); if(resultDelete>=1) {
		 * System.out.println("Data Deleted Successfully!"); }else {
		 * System.out.println("Failed to delete!"); }
		 */

		//Get Single college
		College college1 = collegeImplObj.getCollege(1);
		System.out.println("Id : " + college1.getCollegeId());
		System.out.println("Name : " + college1.getCollegeName());
		
		//fecth all college
		
		System.out.println("Fetch all colleges : ");
		List<College> lstColeges = collegeImplObj.getColleges();
		for(College college :  lstColeges) {
			System.out.println("Id : " + college.getCollegeId() + " Name : "+college.getCollegeName());
				
		}
		
	}

}
