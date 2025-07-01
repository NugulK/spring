package com.yedam.app.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Student kang = ctx.getBean(Student.class);
		System.out.println(kang);
		
		ctx.close();
	}
}
