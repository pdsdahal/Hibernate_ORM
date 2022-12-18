package com.hibernatedemo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "college")
public class College {

	@Column(name = "college_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collegeId;

	@Column(name = "college_name", nullable = false, unique = true, length = 300)
	private String collegeName;

	@Column(name = "college_address", nullable = false)
	private String collegeAddress;

	@Column(name = "college_email", nullable = false, unique = true)
	private String collegeEmail;

	@Column(name = "college_phoneno", nullable = false, unique = true)
	private String collegePhoneNo;

	@Transient
	private int flag;
	
	@Column(name = "estd_date")
	@Temporal(TemporalType.DATE)
	private Date collegeEstDate;
	
	

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Date getCollegeEstDate() {
		return collegeEstDate;
	}

	public void setCollegeEstDate(Date collegeEstDate) {
		this.collegeEstDate = collegeEstDate;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public String getCollegeEmail() {
		return collegeEmail;
	}

	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}

	public String getCollegePhoneNo() {
		return collegePhoneNo;
	}

	public void setCollegePhoneNo(String collegePhoneNo) {
		this.collegePhoneNo = collegePhoneNo;
	}
}