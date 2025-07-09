package com.yedam.app.common.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice // 모든 컨트롤러에 공통적으로 적용할 사항 정의
public class WebControllerAdvice {
	// 예외처리
	// 공통 변수 선언
	@ModelAttribute("contextPath")
	public String contextPath(final HttpServletRequest request) {
		return request.getContextPath();
	}
}
