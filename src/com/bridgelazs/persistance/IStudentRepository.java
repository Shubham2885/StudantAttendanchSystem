package com.bridgelazs.persistance;

import java.util.List;

import com.bridgelazs.entity.Student;

public interface IStudentRepository {

	int save(final Student student);
	List<Student> getAllStudents();
}
