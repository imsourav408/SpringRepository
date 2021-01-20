package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public final class EmployeeMgmtServiceImpl implements EmployeeMgmtService {

	private EmployeeDAO dao;
	
	
	public EmployeeMgmtServiceImpl(EmployeeDAO dao) {
		System.out.println("EmployeeMgmtServiceImpl.1-param constructor");
		this.dao = dao;
	}


	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.fetchEmpsByDesgs()");
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		List<EmployeeBO> listBO=null;
	//	EmployeeDTO dto=null;
		//convert designation to upper case (b.logic)
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		//use DAO
		listBO=dao.getEmployees(desg1, desg2, desg3);
		//convert listBO to listDTO
	/*	for(EmployeeBO bo:listBO) {
			dto=new EmployeeDTO();
			// copies data from one java bean object to another bean object when they have matching properties names,types
			BeanUtils.copyProperties(bo, dto);
			//set round figure salary
			dto.setSal((float)Math.round(bo.getSal()));
			//set serial number
			dto.setSerialNo(listDTO.size()+1);
			//add each dto
			listDTO.add(dto);
		}*/
		//using java 8
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			// copies data from one java bean object to another bean object when they have matching properties names,types
			BeanUtils.copyProperties(bo, dto);
			//set round figure salary
			dto.setSal((float)Math.round(bo.getSal()));
			//set serial number
			dto.setSerialNo(listDTO.size()+1);
			//add each dto
			listDTO.add(dto);
		});
		return listDTO;
	}
}
