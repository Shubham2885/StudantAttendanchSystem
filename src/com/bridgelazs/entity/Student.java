package com.bridgelazs.entity;

public class Student {

	private int rollNo;
	private String fullName;
	private String standard;
	private String mobileNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", standard=" + standard + ", mobileNo="
				+ mobileNo + "]";
	}
	
}
