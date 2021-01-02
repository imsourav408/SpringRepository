package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.PatientManagementService;
import com.nt.vo.PatientVO;

public class MainController {
	private PatientManagementService service=null;
	
	public MainController(PatientManagementService service) {
		this.service=service;
	}
	
	public String processPatientRegistration(PatientVO vo)throws Exception{
		PatientDTO dto=null;
		String msg=null;
		//create DTO class object
		dto=new PatientDTO();
		//set properties value to DTO from BO by converting it int required data type
		dto.setPname(vo.getPname());
		dto.setPadd(vo.getPadd());
		dto.setFees(Float.parseFloat(vo.getFees()));
		dto.setDayCount(Integer.parseInt(vo.getDayCount()));
		//use Service class here
		msg=service.registerPatient(dto);
		return msg;
	}
}
