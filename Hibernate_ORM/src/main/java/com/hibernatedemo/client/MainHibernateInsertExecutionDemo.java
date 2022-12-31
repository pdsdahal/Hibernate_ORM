package com.hibernatedemo.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import com.hibernatedemo.model.Address;
import com.hibernatedemo.model.College;
import com.hibernatedemo.model.CollegeContactInfo;
import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateInsertExecutionDemo {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();

		// Insert

		College collegeObj = new College();
		collegeObj.setCollegeName("Texas International College");

		
		CollegeContactInfo collegeContactInfo = new CollegeContactInfo();
		collegeContactInfo.setCollegeEmail("texas@gmail.com");
		collegeContactInfo.setCollegePhoneNo("456789");
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

		int addFlag = collegeImplObj.addCollege(collegeObj);
		if (addFlag >= 1) {
			System.out.println("Data Saved!!!");
		} else {
			System.out.println("Failed to insert!!!");
		}

	}

}
