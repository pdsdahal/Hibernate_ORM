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

public class MainHibernateUpdateExecutionDemo {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();
		
		College collegeObj = new College();
		collegeObj.setCollegeId(1);
		
		collegeObj.setCollegeName("ABC International College");

		
		CollegeContactInfo collegeContactInfo = new CollegeContactInfo();
		collegeContactInfo.setCollegeContactInfoId(1);
		collegeContactInfo.setCollegeEmail("abc@gmail.com");
		collegeContactInfo.setCollegePhoneNo("456789");
		collegeObj.setCollegeContactInfo(collegeContactInfo);
		
		collegeObj.setCollegeEstDate(new Date());

		String filePathAdd = "src/main/resources/images/ADD.jpg";
		Path pathAdd = Paths.get(filePathAdd);
		byte[] byteImageFileAdd = Files.readAllBytes(pathAdd);

		Address address = new Address();
		address.setWardNo(1);
		address.setCountryName("Nepal");
		address.setMunicipalityName("Bhaktapur");
		address.setProvinceName("Bagmati");

		collegeObj.setAddress(address);
		collegeObj.setCollegeLogo(byteImageFileAdd);

		int updateFlag = collegeImplObj.updateCollege(collegeObj);
		if (updateFlag >= 1) {
			System.out.println("Data Updated!!!");
		} else {
			System.out.println("Failed to Update!!!");
		}
	}

}
