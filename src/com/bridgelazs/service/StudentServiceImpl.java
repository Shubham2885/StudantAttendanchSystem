package com.bridgelazs.service;

import java.util.List;

import com.bridgelazs.entity.Student;
import com.bridgelazs.interfaces.IStudentService;
import com.bridgelazs.persistance.IStudentRepository;
import com.bridgelazs.persistance.StudentRepository;

public class StudentServiceImpl implements IStudentService {

	private IStudentRepository studentRepository;
	
	public StudentServiceImpl() {
		studentRepository = new StudentRepository();
	}
	
	@Override
	public void addNewStudent(String firstName, String lastName, String mobile, String standard) {

		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setMobileNo(mobile);
		student.setStandard(standard);
		
		studentRepository.save(student);
	}

	@Override
	public List<Student> showListOfStudent(String standard) {
		final List<Student> listOfStudent = studentRepository.getAllStudents();
		for(Student student : listOfStudent) {
			if(standard.compareTo(student.getStandard()) == 0) {
				System.out.println("**********************************");
				System.out.println("Roll No : "+student.getRollNo());
				System.out.println("Full Name : "+student.getFirstName() + " "+student.getLastName());
				System.out.println("Mobile No : "+student.getMobileNo());
				System.out.println("Standard : "+student.getStandard());
			}
		}
		return listOfStudent;
	}

}
