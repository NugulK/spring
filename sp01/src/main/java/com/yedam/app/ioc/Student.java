package com.yedam.app.ioc;

public class Student {
	private int ssn;
	private String name;
	private String school;
	
	public Student() {
		System.out.println("Student Instance 생성");
	}
	
	// get,set 
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [ssn=" + ssn + ", name=" + name + ", school=" + school + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
