package com.yedam.app.di.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yedam.app.di.SamsungTV;
import com.yedam.app.di.SonySpeaker;

@Configuration // Spring 설정
public class JavaConfig {
	@Bean
	public SonySpeaker createSonySpeaker() {
		return new SonySpeaker();
	}
	
	@Bean
	SamsungTV createSamsungTV(SonySpeaker speaker) {
		// 1) 생성자 주입
		// SamsungTV tv = new SamsungTV(speaker);
		
		// 2) Setter 주입
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(speaker);
		return tv;	
	}
}
