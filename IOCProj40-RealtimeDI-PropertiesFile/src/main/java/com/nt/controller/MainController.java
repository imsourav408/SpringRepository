package com.nt.controller;

import java.sql.Date;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentRegistrationService;
import com.nt.vo.StudentVO;

public final class MainController {
	private StudentRegistrationService service=null;
	
	public MainController(StudentRegistrationService service) {
		System.out.println("MainController_1-param constructor");
		this.service=service;
	}
	
	public String processStudent(StudentVO vo)throws Exception{
		System.out.println("MainController.processStudent()");
		String msg=null;
		StudentDTO dto=null;
		//convert vo to dto
		dto=new StudentDTO();
		if(vo!=null) {
			dto.setSname(vo.getSname());
			dto.setSadd(vo.getSadd());
			dto.setSmark(Float.parseFloat(vo.getSmark()));
			dto.setTmark(Float.parseFloat(vo.getTmark()));
			dto.setDob(Date.valueOf(vo.getDob()));
		}
		//invoke service 
		msg=service.calculateOverallCGPA(dto);
		return msg;
	}
}
