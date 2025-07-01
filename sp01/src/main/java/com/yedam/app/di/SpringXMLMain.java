package com.yedam.app.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringXMLMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		SamsungTV tv = ctx.getBean(SamsungTV.class);
		tv.powerOff();
		
		ctx.close();
	}
}
