package com.hibernatedemo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
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
	
	@Transient
	private int flag;
	
	@Column(name = "estd_date")
	@Temporal(TemporalType.DATE)
	private Date collegeEstDate;
	
	@Column(name = "logo", columnDefinition = "LONGBLOB" )
	@Lob
	private byte[] collegeLogo;
	
	@Embedded
	private Address address;
	
	
	@OneToOne(fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
	private CollegeContactInfo collegeContactInfo;
	
	
	
	public CollegeContactInfo getCollegeContactInfo() {
		return collegeContactInfo;
	}

	public void setCollegeContactInfo(CollegeContactInfo collegeContactInfo) {
		this.collegeContactInfo = collegeContactInfo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
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

}