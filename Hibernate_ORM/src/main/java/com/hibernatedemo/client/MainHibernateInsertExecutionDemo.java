package com.hibernatedemo.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hibernatedemo.model.Address;
import com.hibernatedemo.model.College;
import com.hibernatedemo.model.CollegeContactInfo;
import com.hibernatedemo.model.Department;
import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateInsertExecutionDemo {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();

		// Insert

		College collegeObj = new College();
		collegeObj.setCollegeName("Texas International College");

		
		CollegeContactInfo collegeContactInfo = new CollegeContactInfo();
		collegeContactInfo.setCollegeEmail("texas@gmail.com");
		collegeContactInfo.setCollegePhoneNo("23456789");
		collegeObj.setCollegeContactInfo(collegeContactInfo);
		
		collegeObj.setCollegeEstDate(new Date());

		String filePathAdd = "src/main/resources/images/ADD.jpg";
		Path pathAdd = Paths.get(filePathAdd);
		byte[] byteImageFileAdd = Files.readAllBytes(pathAdd);

		Address address = new Address();
		address.setWardNo(1);
		address.setCountryName("Nepal");
		address.setMunicipalityName("Kathmandu");
		address.setProvinceName("Bagmati");

		collegeObj.setAddress(address);
		collegeObj.setCollegeLogo(byteImageFileAdd);
		
		
		List<Department> texasDepartments = new ArrayList<Department>();
		Department bcaDepartment = new Department();
		bcaDepartment.setDepartmentName("BCA");
		bcaDepartment.setLocation("Mitrapark Kathamndu Nepal Block A");
		bcaDepartment.setCollege(collegeObj);
		
		Department csitDepartment = new Department();
		csitDepartment.setDepartmentName("CSIT");
		csitDepartment.setLocation("Mitrapark Kathamndu Nepal Block B");
		csitDepartment.setCollege(collegeObj);
		
		texasDepartments.add(bcaDepartment);
		texasDepartments.add(csitDepartment);
		
		collegeObj.setDepartments(texasDepartments);
		

		int addFlag = collegeImplObj.addCollege(collegeObj);
		if (addFlag >= 1) {
			System.out.println("Data Saved!!!");
		} else {
			System.out.println("Failed to insert!!!");
		}

	}

}
