package com.bridgelazs.service;

import java.util.ArrayList;

import com.bridgelazs.entity.Student;
import com.bridgelazs.interfaces.IStudentService;

public class StudentServiceImpl implements IStudentService {

	private ArrayList<Student> listOfStudent;
	
	public StudentServiceImpl() {
		listOfStudent = new ArrayList<Student>();
	}
	
	@Override
	public void addNewStudent(String name, String mobile, String standard) {

		Student student = new Student();
		student.setRollNo(listOfStudent.size()+1);
		student.setFullName(name);
		student.setMobileNo(mobile);
		student.setStandard(standard);
		
		listOfStudent.add(student);
	}

	@Override
	public ArrayList<Student> showListOfStudent(String standard) {
		for(Student student : listOfStudent) {
			if(standard.equals(student.getStandard())) {
				System.out.println("**********************************");
				System.out.println("Roll No : "+student.getRollNo());
				System.out.println("Full Name : "+student.getFullName());
				System.out.println("Mobile No : "+student.getMobileNo());
				System.out.println("Standard : "+student.getStandard());
			}
		}
		return listOfStudent;
	}

}
