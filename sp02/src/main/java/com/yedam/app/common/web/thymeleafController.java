package com.yedam.app.common.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class thymeleafController {
	private final EmpService empService;
	
	@GetMapping("thymeleaf")
	public String thymeleafTest(Model model) {
		EmpVO empVO = EmpVO.builder().employeeId(100).build();
		
		EmpVO findVO = empService.findInfoById(empVO);
		model.addAttribute("empInfo", findVO);
		
		List<EmpVO> list = empService.findAllList();
		model.addAttribute("empList",list);
		return "test";
		// prefix	 : classpath: /templates/
		// suffix    : .html
		// classpath : /templates/test.html
	}
}
