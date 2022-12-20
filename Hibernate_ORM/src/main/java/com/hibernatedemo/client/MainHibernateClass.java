package com.hibernatedemo.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import com.hibernatedemo.model.College;
import com.hibernatedemo.serviceimpl.CollgeServiceImpl;

public class MainHibernateClass {

	public static void main(String[] args) throws IOException {

		CollgeServiceImpl collegeImplObj = new CollgeServiceImpl();
		
		// Insert
		
		College addCollegeObj = new College();
		addCollegeObj.setCollegeName("XYZ International College");
		addCollegeObj.setCollegeAddress("Mitrapark 1 Baneshowr");
		addCollegeObj.setCollegeEmail("xyz@gmail.com");
		addCollegeObj.setCollegePhoneNo("345678");
		addCollegeObj.setCollegeEstDate(new Date());

		String filePathAdd = "src/main/resources/images/ADD.jpg";
		Path pathAdd = Paths.get(filePathAdd);
		byte[] byteImageFileAdd = Files.readAllBytes(pathAdd);
		addCollegeObj.setCollegeLogo(byteImageFileAdd);

		int addFlag = collegeImplObj.addCollege(addCollegeObj);
		if (addFlag >= 1) {
			System.out.println("Data Saved!!!");
		} else {
			System.out.println("Failed to insert!!!");
		}

		
		
		//update
		College updateCollegeObj = new College();
		updateCollegeObj.setCollegeId(1);
		updateCollegeObj.setCollegeName("Texas International College");
		updateCollegeObj.setCollegeAddress("Mitrapark 1 Baneshowr");
		updateCollegeObj.setCollegeEmail("texas@gmail.com");
		updateCollegeObj.setCollegePhoneNo("4567890");
		updateCollegeObj.setCollegeEstDate(new Date());

		String filePath = "src/main/resources/images/Product.png";
		Path path = Paths.get(filePath);
		byte[] byteImageFile = Files.readAllBytes(path);
		updateCollegeObj.setCollegeLogo(byteImageFile);
		
		int updateFlag = collegeImplObj.updateCollege(updateCollegeObj);
		if (updateFlag >= 1) {
			System.out.println("Data Updated!!!");
		} else {
			System.out.println("Failed to Update!!!");
		}

	}

}
