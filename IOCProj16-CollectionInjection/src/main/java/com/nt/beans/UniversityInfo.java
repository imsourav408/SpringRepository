package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class UniversityInfo {
	private Map<Integer,String> facultyDetails;
	private Map<String,Date> datesInfo;
	
	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}
	public void setDatesInfo(Map<String, Date> datesInfo) {
		this.datesInfo = datesInfo;
	}
	
	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", datesInfo=" + datesInfo + "]";
	}
}
	
	
	