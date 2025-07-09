package com.yedam.app.emp.service;

import java.util.List;
import java.util.Map;

// 실제로 사용자에게 제공하는 기능 :  Business Layer 영역
public interface EmpService {
	// 전체 사원정보 조회
	public List<EmpVO> findAllList();
	// 사원 정보 단건 조회
	public EmpVO findInfoById(EmpVO empVO);
	// 사원 정보 단건 등록
	public int createInfo(EmpVO empVO);
	// 사원 정보 단건 수정
	public Map<String, Object> modifyInfo (EmpVO empVO);
	// 사원 정보 단건 삭제
	public Map<String, Object> removeInfo (int empId);

}
