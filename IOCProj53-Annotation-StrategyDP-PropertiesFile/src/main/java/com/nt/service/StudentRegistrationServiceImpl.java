package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("studentService")
public final class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	@Qualifier("oraStudentDAO")
	private StudentDAO dao;
	
	@Value("${stud.age}")
	private int age;

	@Override
	public String calculateOverallCGPA(StudentDTO dto) throws Exception {
		System.out.println("Student age: "+age);
		StudentBO bo=null;
		float cgpa=0.0f;
		int result=0;
		String msg=null;
		//calculate overall CGPA
		cgpa=(((dto.getSmark()*100)/dto.getTmark())/10)+0.5f;
		//prepare BO class object having persistent data
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setDob(dto.getDob());
		bo.setSmark(dto.getSmark());
		bo.setTmark(dto.getTmark());
		bo.setCgpa(cgpa);
		//use DAO
		result=dao.insert(bo);
		//process the result
		if(result==0)
			msg="Student Registration Failed!!!!  Secured Mark:"+dto.getSmark()+", Overall CGPA:"+cgpa;
		else
			msg="Student Registration Succeded...  Secured Mark:"+dto.getSmark()+", Overall CGPA:"+cgpa;
		return msg;
	}
}
