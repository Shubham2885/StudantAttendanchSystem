package com.bridgelazs.interfaces;

import java.util.ArrayList;

import com.bridgelazs.entity.Student;

public interface IStudentService {

	public void addNewStudent(final String name, final String mobile, final String standard);
	public ArrayList<Student> showListOfStudent(String standard);
}
