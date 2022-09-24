package com.bridgelazs.interfaces;

import java.util.List;

import com.bridgelazs.entity.Student;

public interface IStudentService {

	public void addNewStudent(final String firstName, final String lastName, final String mobile, final String standard);
	public List<Student> showListOfStudent(String standard);
}
