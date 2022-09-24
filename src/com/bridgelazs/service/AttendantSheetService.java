package com.bridgelazs.service;

import java.util.ArrayList;
import java.util.Date;

import com.bridgelazs.comman.ScannerUtil;
import com.bridgelazs.entity.AttendentSheet;
import com.bridgelazs.entity.Student;
import com.bridgelazs.interfaces.IAttendantSheetService;
import com.bridgelazs.interfaces.IStudentService;
import com.bridgelazs.interfaces.ITeacherService;

public class AttendantSheetService implements IAttendantSheetService {

	private ArrayList<AttendentSheet> listOfAttendance;
	
	public AttendantSheetService() {
		listOfAttendance = new ArrayList<AttendentSheet>();
	}
	
	@Override
	public void takeAttendance(IStudentService studentService, int teacherId, String subject,
			String standard) {
		ArrayList<Student> listOfStudent = null ;studentService.showListOfStudent(standard);
		
		for(Student student : listOfStudent) {
			System.out.println("**************************");
			System.out.println("Roll No = "+ student.getRollNo());
			System.out.println("Name = "+ student.getFirstName() + " "+ student.getLastName());
			
			String status = ScannerUtil.getString("Status...");
			
			AttendentSheet attendentSheet = new AttendentSheet();
			attendentSheet.setSrNo(listOfAttendance.size()+1);
			attendentSheet.setRollNo(student.getRollNo());
			attendentSheet.setStandard(standard);
			attendentSheet.setSubject(subject);
			attendentSheet.setStatus(status);
			attendentSheet.setTeacherId(teacherId);
			attendentSheet.setDate(new Date());
			
			listOfAttendance.add(attendentSheet);
		}
	}

	@Override
	public void showAttendance() {
		System.out.println(listOfAttendance);
	}
	
}
