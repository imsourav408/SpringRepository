package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public final class StudentRegistrationServiceImpl implements StudentRegistrationService {
	private StudentDAO dao;
	
	
	public StudentRegistrationServiceImpl(StudentDAO dao) {
		System.out.println("StudentRegistrationServiceImpl.StudentRegistrationServiceImpl()");
		this.dao = dao;
	}


	@Override
	public String calculateOverallCGPA(StudentDTO dto)throws Exception {
		float cgpa=0.0f;
		StudentBO bo=null;
		int result=0;
		String msg=null;
		//calculate overall CGPA
		cgpa=(((dto.getSmark()*100)/dto.getTmark())/10)+0.5f;
		//prepare BO class object having persistence data
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setDob(dto.getDob());
		bo.setSmark(dto.getSmark());
		bo.setTmark(dto.getTmark());
		bo.setCgpa(cgpa);
		//use DAO
		result=dao.insert(bo);
		//generate message
		if(result==0)
			msg="Student Registration Failed!!!!  Secured Mark:"+dto.getSmark()+", Overall CGPA:"+cgpa;
		else
			msg="Student Registration Succeded...  Secured Mark:"+dto.getSmark()+", Overall CGPA:"+cgpa;
		return msg;
	}//business method

}//class
