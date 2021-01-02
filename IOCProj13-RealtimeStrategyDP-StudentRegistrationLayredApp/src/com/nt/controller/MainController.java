package com.nt.controller;

import java.sql.Date;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentRegistrationService;
import com.nt.vo.StudentVO;

public final class MainController {
	
	private StudentRegistrationService service;

	public MainController(StudentRegistrationService service) {
		System.out.println("MainController.MainController()");
		this.service = service;
	}
	
	public String processStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//convert VO class to DTO class
		dto=new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setDob(Date.valueOf(vo.getDob()));
		dto.setSmark(Float.parseFloat(vo.getSmark()));
		dto.setTmark(Float.parseFloat(vo.getTmark()));
		//use service class business method
		result=service.calculateOverallCGPA(dto);
		return result;
	}	
}
