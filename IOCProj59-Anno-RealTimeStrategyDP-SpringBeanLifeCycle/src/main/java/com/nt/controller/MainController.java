package com.nt.controller;

import java.sql.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentRegistrationService;
import com.nt.vo.StudentVO;

@Controller("controller")
public final class MainController {
	
	@Autowired
	private StudentRegistrationService service;
	
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
	
	@PostConstruct
	public void myInit() {
		System.out.println("MainController.myInit()");
		if(service==null)
			throw new IllegalArgumentException("Service not injected");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("MainController.myDestroy()");
		service=null;
	}
}
