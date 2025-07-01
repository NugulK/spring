package com.yedam.app.di;

public class DefaultMain {
	public static void main(String[] args) {
		// 1. 생성자 방식
		SonySpeaker speaker = new SonySpeaker();
		//SamsungTV tv = new SamsungTV(speaker);
		
		//2. set방식
		SamsungTV tv= new SamsungTV();
		tv.setSpeaker(speaker);
		tv.powerOn();
	}
}
