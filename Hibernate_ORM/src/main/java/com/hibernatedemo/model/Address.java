package com.hibernatedemo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name = "county", nullable =  false)
	private String countryName;
	
	@Column(name = "province_name", nullable =  false)
	private String provinceName;
	
	@Column(name = "municipality_name", nullable =  false)
	private String municipalityName;
	
	@Column(name = "ward_no", nullable =  false)
	private int wardNo;
	
	

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getMunicipalityName() {
		return municipalityName;
	}

	public void setMunicipalityName(String municipalityName) {
		this.municipalityName = municipalityName;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}
	
	
	
	
}
