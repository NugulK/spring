package com.yedam.app.di.java;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.yedam.app.di.SamsungTV;

public class SpringJavaMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext("classpath:JavaBaseContext.xml");
		
		SamsungTV tv = ctx.getBean(SamsungTV.class);
		tv.powerOff();
		
		ctx.close();
	}
}
