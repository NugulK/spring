package com.yedam.app.emp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;
@Service // AOP(공통 기능)에 대해 지원이 가능한 Bean
public class EmpServiceImpl implements EmpService {
	
	private EmpMapper empMapper;
	
	public EmpServiceImpl(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}
	@Override
	public List<EmpVO> findAllList() {
		return empMapper.selectAll();
	}

	@Override
	public EmpVO findInfoById(EmpVO empVO) {
		return empMapper.selectInfo(empVO);
	}

	@Override
	public int createInfo(EmpVO empVO) {
		int result = empMapper.insertInfo(empVO);
		return result == 1 ? empVO.getEmployeeId() : -1;
	}

	@Override
	public Map<String, Object> modifyInfo(EmpVO empVO) {
		Map<String, Object> map = new HashMap<>();
		boolean isSuccessed = false;
		
		int result = empMapper.updateInfo(empVO.getEmployeeId(), empVO);
		
		if(result == 1) {
			isSuccessed = true;
		}
		
		map.put("result", isSuccessed);
		map.put("target", empVO);
		/*
		 * {
		 * 	"result" : true,
		 * 	"target" : {"employeeId" : 100, ...}
		 * }
		 */
		return map;
	}

	@Override
	public Map<String, Object> removeInfo(int empId) {
		Map<String, Object> map = new HashMap<>();
		
		int result = empMapper.deleteInfo(empId);
		
		if(result == 1) {
			map.put("employeeId", empId);
		}
		
		return map;
	}

}
