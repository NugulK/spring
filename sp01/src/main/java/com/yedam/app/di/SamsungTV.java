package com.yedam.app.di;

public class SamsungTV {
	private SonySpeaker speaker;
	
	// 방법 두가지 
	// 1.생성자로 필드값주기
	public SamsungTV(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	// 2.set를 이용해 필드값을 받도록 하기
	// default 생성자가 있어야함
	public SamsungTV() {}; // default 생성자
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	
	
	
	public void powerOn() {
		speaker.on();
	}
	
	public void powerOff() {
		speaker.off();
	}
	
	public void volumUp() {
		speaker.vloumeUp();
	}
	
	public void volumDown() {
		speaker.vloumeDown();
	}
}
