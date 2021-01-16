package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public final class StudentRegistrationServiceImpl implements StudentRegistrationService {
	private StudentDAO dao;
	private String os;
	private String path;
	
	public StudentRegistrationServiceImpl(StudentDAO dao) {
		System.out.println("StudentRegistrationServiceImpl_1-param constructor");
		this.dao=dao;
	}
	
	public void setOs(String os) {
		System.out.println("StudentRegistrationServiceImpl.setOs()");
		this.os = os;
	}
	
	public void setPath(String path) {
		System.out.println("StudentRegistrationServiceImpl.setPath()");
		this.path = path;
	}
	
	@Override
	public String calculateOverallCGPA(StudentDTO dto) throws Exception {
		System.out.println("StudentRegistrationServiceImpl.calculateOverallCGPA()----->path="+path+" os="+os);
		String msg=null;
		StudentBO bo=null;
		int result=0;
		float cgpa=0.0f;
		//calculate overall CGPA
		cgpa=(((dto.getSmark()*100)/dto.getTmark())/10)+0.5f;
		//convert dto to bo
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		bo.setCgpa(cgpa);
		//invoke dao
		result=dao.insert(bo);
		//generate message
		if(result==0)
			msg="Student Registration Failed!!!!  Secured Mark:"+dto.getSmark()+", Overall CGPA:"+cgpa;
		else
			msg="Student Registration Succeded...  Secured Mark:"+dto.getSmark()+", Overall CGPA:"+cgpa;
		return msg;
	}
}
