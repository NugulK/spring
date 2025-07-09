package com.yedam.app.aop.mapper;

import org.apache.ibatis.annotations.Insert;

public interface AopMapper {
	@Insert("INSERT INTO t_aop_test VALUES(#{value})")
	public int insert(String value);
}
