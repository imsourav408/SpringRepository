package com.nt.service;

import com.nt.dto.StudentDTO;

public interface StudentRegistrationService {
	public String calculateOverallCGPA(StudentDTO dto)throws Exception;
}
