package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public final class MainController {
	
	private EmployeeMgmtService service=null;

	public MainController(EmployeeMgmtService service) {
		System.out.println("MainController.1-param constructor");
		this.service = service;
	}
	
	public List<EmployeeVO> gatherEmpsByDesgs(String desg1,String desg2,String desg3)throws Exception{
		List<EmployeeVO> listVO=new ArrayList<EmployeeVO>();
		List<EmployeeDTO> listDTO=null;
	//	EmployeeVO vo=null;
		//use service
		listDTO=service.fetchEmpsByDesgs(desg1, desg2, desg3);
		//convert listDTO to listVO
	/*	for(EmployeeDTO dto:listDTO) {
			//convert each DTO to each VO
			vo=new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSerialNo(String.valueOf(dto.getSerialNo()));
            vo.setDeptno(String.valueOf(dto.getDeptno()));
            vo.setSal(String.valueOf(dto.getSal()));
            vo.setEmpno(String.valueOf(dto.getEmpno()));
            vo.setComm(String.valueOf(dto.getComm()));
            vo.setMgr(String.valueOf(dto.getMgr()));
            vo.setHiredate(String.valueOf(dto.getHiredate()));
			//add each VO to listVO
            listVO.add(vo);
		}*/
		listDTO.forEach(dto->{
			//convert each DTO to each VO
			EmployeeVO vo=new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSerialNo(String.valueOf(dto.getSerialNo()));
            vo.setDeptno(String.valueOf(dto.getDeptno()));
            vo.setSal(String.valueOf(dto.getSal()));
            vo.setEmpno(String.valueOf(dto.getEmpno()));
            vo.setComm(String.valueOf(dto.getComm()));
            vo.setMgr(String.valueOf(dto.getMgr()));
            vo.setHiredate(String.valueOf(dto.getHiredate()));
			//add each VO to listVO
            listVO.add(vo);
		});
		return listVO;
	}
}
