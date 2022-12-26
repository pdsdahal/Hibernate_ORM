package com.hibernatedemo.service;

import java.util.List;

import com.hibernatedemo.model.College;

public interface CollegeService {

	public int addCollege(College college);
	public int updateCollege(College college);
	public int deleteCollge(int id);
	public College getCollege(int id);
	public List<College> getColleges();
}
