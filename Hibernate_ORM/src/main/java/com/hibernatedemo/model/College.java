package com.hibernatedemo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name = "college")
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
	
	@Column(name = "logo", columnDefinition = "LONGBLOB" )
	@Lob
	private byte[] collegeLogo;
	
	
	public byte[] getCollegeLogo() {
		return collegeLogo;
	}

	public void setCollegeLogo(byte[] collegeLogo) {
		this.collegeLogo = collegeLogo;
	}

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