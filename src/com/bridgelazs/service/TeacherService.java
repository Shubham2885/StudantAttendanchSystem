package com.bridgelazs.service;

import java.util.ArrayList;

import com.bridgelazs.entity.Teacher;
import com.bridgelazs.interfaces.ITeacherService;

public class TeacherService implements ITeacherService {

	private ArrayList<Teacher> listOfTeachers;
	
	public TeacherService() {
		listOfTeachers = new ArrayList<Teacher>();
	}
	
	@Override
	public void addNew(String fName, String lName, String standard, String subject) {
		Teacher teacher = new Teacher();
		teacher.setTeacherId(listOfTeachers.size()+1);
		teacher.setfName(fName);
		teacher.setlName(lName);
		teacher.setStandard(standard);
		teacher.setSubject(subject);
		
		listOfTeachers.add(teacher);
	}

	@Override
	public void showListOfTeachers() {
		System.out.println();
		for(Teacher teacher : listOfTeachers) {
			System.out.println("*******************************");
			System.out.println("Teacher Id = "+teacher.getTeacherId());
			System.out.println("First Name = "+teacher.getfName());
			System.out.println("Last Name = "+teacher.getlName());
			System.out.println("Subject  = "+teacher.getSubject());
			System.out.println("Standard = "+teacher.getStandard());
		}
	}

}
