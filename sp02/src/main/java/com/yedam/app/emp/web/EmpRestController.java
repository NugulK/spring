package com.yedam.app.emp.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

import lombok.RequiredArgsConstructor;

@RestController // @Controller + 모든 메서드에 @ResponseBody를 적용
@RequiredArgsConstructor
public class EmpRestController {
	private final EmpService empService;
	
	// 전체조회 : GET => emps
	@GetMapping("emps")
	public List<EmpVO> empList(){
		return empService.findAllList();
	}
	// 단건조회 : GET => emps/100
	@GetMapping("emps/{eid}")
	public EmpVO empInfo(@PathVariable Integer eid) {
		EmpVO empVO = EmpVO.builder().employeeId(eid).build();
		return empService.findInfoById(empVO);
	}
	// 등록 : POST => emps
	@PostMapping("emps")
	public int empInsert(@RequestBody EmpVO empVO) {
		return empService.createInfo(empVO);
	}
	// 수정 : PUT => emps/100
	@PutMapping("emps/{eid}")
	public Map<String, Object> empUpdate(@PathVariable Integer eid,@RequestBody EmpVO empVO){
		empVO.setEmployeeId(eid);
		return empService.modifyInfo(empVO);
	}
	// 삭제 : DELETE => emps/100
	@DeleteMapping("emps/{eid}")
	public Map<String, Object> empDelete(@PathVariable Integer eid){
		return empService.removeInfo(eid);
	}
}
