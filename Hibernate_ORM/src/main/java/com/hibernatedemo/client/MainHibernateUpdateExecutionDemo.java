package com.hibernatedemo.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import com.hibernatedemo.model.Address;
import com.hibernatedemo.model.College;
import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateUpdateExecutionDemo {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();
		
	
	
		College collegeObj = new College();
		collegeObj.setCollegeId(1);
		collegeObj.setCollegeName("Texas International College");
		
		Address address1 = new Address();
		address1.setWardNo(1);
		address1.setCountryName("Nepal");
		address1.setMunicipalityName("Kathmandu");
		address1.setProvinceName("Bagmati");
		
		collegeObj.setAddress(address1);
		//collegeObj.setCollegeEmail("texas@gmail.com");
		//collegeObj.setCollegePhoneNo("4567890");
		collegeObj.setCollegeEstDate(new Date());

		String filePath = "src/main/resources/images/Product.png";
		Path path = Paths.get(filePath);
		byte[] byteImageFile = Files.readAllBytes(path);
		collegeObj.setCollegeLogo(byteImageFile);
		
		int updateFlag = collegeImplObj.updateCollege(collegeObj);
		if (updateFlag >= 1) {
			System.out.println("Data Updated!!!");
		} else {
			System.out.println("Failed to Update!!!");
		}
	}

}
