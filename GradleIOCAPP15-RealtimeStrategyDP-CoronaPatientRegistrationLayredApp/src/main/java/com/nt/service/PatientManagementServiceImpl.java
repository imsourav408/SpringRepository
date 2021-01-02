package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientRegistrationManagementDAO;
import com.nt.dto.PatientDTO;

public class PatientManagementServiceImpl implements PatientManagementService {
	private PatientRegistrationManagementDAO dao=null;
	
	public PatientManagementServiceImpl(PatientRegistrationManagementDAO dao) {
		this.dao=dao;
	}
	
	@Override
	public String registerPatient(PatientDTO dto) throws Exception {
		PatientBO bo=null;
		int result=0;
		float totalAmt=0.0f;
		String msg=null;
		//calculate total amount
		totalAmt=dto.getFees()*dto.getDayCount();
		//create PatientBO object
		bo=new PatientBO();
		//set properties values to bo class object
		bo.setPname(dto.getPname());
		bo.setPadd(dto.getPadd());
		bo.setDayCount(dto.getDayCount());
		bo.setFees(dto.getFees());
		bo.setTotalAmt(totalAmt);
		//use DAO for insert into DB
		result=dao.insert(bo);
		//check whether result is inserted or not
		if(result==0)
			msg="Patient Registration Failed!!! ,Total Amount="+totalAmt;
		else
			msg="Patient Registration Succedded...Total Amount="+totalAmt;
		return msg;
	}
}
