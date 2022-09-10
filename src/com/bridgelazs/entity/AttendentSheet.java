package com.bridgelazs.entity;

import java.util.Date;

public class AttendentSheet {

	private int srNo;
	private int rollNo;
	private int teacherId;
	private String subject;
	private String standard;
	private Date date;
	private String status;
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AttendentSheet [srNo=" + srNo + ", rollNo=" + rollNo + ", teacherId=" + teacherId + ", subject="
				+ subject + ", standard=" + standard + ", date=" + date + ", status=" + status + "]";
	}
	
	
}
