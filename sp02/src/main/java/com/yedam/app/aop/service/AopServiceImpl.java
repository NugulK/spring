package com.yedam.app.aop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.aop.mapper.AopMapper;

import lombok.RequiredArgsConstructor;

@Service // AOP(관심분리) 기능을 적용할 수 있는 대상
@RequiredArgsConstructor
public class AopServiceImpl implements AopService {
	// Lombok을 활용한 생성자 주입
	private final AopMapper aopMap;
	
	@Transactional
	@Override
	public void insert() {
		aopMap.insert("101"); // commit 
		aopMap.insert("a101"); // error로 인해 rollback
	}

}
