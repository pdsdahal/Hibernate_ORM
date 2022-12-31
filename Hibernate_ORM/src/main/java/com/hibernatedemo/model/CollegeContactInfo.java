package com.hibernatedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "college_contact_info")
@Table(name = "college_contact_info")
public class CollegeContactInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "contact_id")
	private int collegeContactInfoId;

	@Column(name="phoneno", unique = true, nullable = false)
	private String collegePhoneNo;
	
	@Column(name="email", unique = true, nullable = false)
	private String collegeEmail;
	
	
	@OneToOne(mappedBy = "collegeContactInfo")
	private College college;
	
	
	
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public CollegeContactInfo() {
		
	}

	public int getCollegeContactInfoId() {
		return collegeContactInfoId;
	}

	public void setCollegeContactInfoId(int collegeContactInfoId) {
		this.collegeContactInfoId = collegeContactInfoId;
	}

	public String getCollegePhoneNo() {
		return collegePhoneNo;
	}

	public void setCollegePhoneNo(String collegePhoneNo) {
		this.collegePhoneNo = collegePhoneNo;
	}

	public String getCollegeEmail() {
		return collegeEmail;
	}

	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}
	
	
	
}
