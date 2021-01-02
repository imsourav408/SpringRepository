package com.nt.service;

import com.nt.dto.PatientDTO;

public interface PatientManagementService {
	public String registerPatient(PatientDTO dto)throws Exception;
}
