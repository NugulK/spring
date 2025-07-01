package com.yedam.app.di.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LGTV {
	private MarshallSpeaker speaker;
	
	
	// 1) 생성자 주입
//	@Autowired
	public LGTV(MarshallSpeaker speaker) {
		this.speaker = speaker;
	}
	
	// 2) Setter 주입
	public LGTV() {};
	@Autowired
	public void setSpeaker(MarshallSpeaker speaker){
		this.speaker = speaker;
	}
	
	public void powerOn() {
		speaker.on();
	}
	public void powerOff() {
		speaker.off();
	}
}
