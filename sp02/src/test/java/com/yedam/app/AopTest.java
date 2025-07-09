package com.yedam.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yedam.app.aop.service.AopService;

@SpringBootTest
public class AopTest {
	@Autowired
	private AopService aopService;
	
	@Test
	public void aopTest() {
		aopService.insert();
	}
}
