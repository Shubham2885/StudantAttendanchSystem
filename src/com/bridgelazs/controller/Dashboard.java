package com.bridgelazs.controller;

import java.util.Scanner;

import com.bridgelazs.comman.RegexUtil;
import com.bridgelazs.interfaces.IAttendantSheetService;
import com.bridgelazs.interfaces.IStudentService;
import com.bridgelazs.interfaces.ITeacherService;
import com.bridgelazs.service.AttendantSheetService;
import com.bridgelazs.service.StudentServiceImpl;
import com.bridgelazs.service.TeacherService;

public class Dashboard {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		IStudentService studentService = new StudentServiceImpl();
		ITeacherService teacherService = new TeacherService();
		IAttendantSheetService attendantSheetService = new AttendantSheetService();
		
		int ch = 1;
		do {
			System.out.println("1 Add new student");
			System.out.println("2 List Of Students");
			System.out.println("3 Add new Teacher");
			System.out.println("4 List Of Teachers");
			System.out.println("5 Take Attendance");
			System.out.println("6 Show Attendance");
				
			System.out.println("Enter your choice...");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
					System.out.println("Enter Name");
					final String name = scanner.next();
					
					System.out.println("Enter mobile");
					final String mobile = scanner.next();
					
					boolean result = RegexUtil.mobileNumberValidation(mobile);
					if(!result) {
						System.out.println("Invalid Mobile No...");
						break;
					}
					
					System.out.println("Enter stardard");
					String standard = scanner.next();
					studentService.addNewStudent(name, mobile, standard);
				break;
			case 2 : 
				System.out.println("Enter the standard...");
				standard = scanner.next();
				studentService.showListOfStudent(standard);
				break;
			case 3:
				System.out.println("Enter First Name");
				final String fname = scanner.next();
				
				System.out.println("Enter Last Name");
				final String lname = scanner.next();
				
				System.out.println("Enter Subject");
				String subject = scanner.next();
				
				System.out.println("Enter Standard");
				standard = scanner.next();
				
				teacherService.addNew(fname, lname, standard, subject);
			break;
			case 4 : 
				teacherService.showListOfTeachers();
				break;
			case 5 :
				System.out.println("Enter Teacher id");
				final int teacherId = scanner.nextInt();
				
				System.out.println("Enter Subject");
				subject = scanner.next();
				
				System.out.println("Enter Standard");
				standard = scanner.next();
				
				attendantSheetService.takeAttendance(studentService, teacherId, subject, standard);
				break;
			case 6 : 
				attendantSheetService.showAttendance();
				break;
			default:
				break;
			}
			
			System.out.println("Do you want to confineu...press 1");
			ch = scanner.nextInt();
		}while(ch == 1);
	}
}
