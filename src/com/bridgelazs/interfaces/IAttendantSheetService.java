package com.bridgelazs.interfaces;

public interface IAttendantSheetService {

	public void takeAttendance(IStudentService studentService, int teacherId, String subject, String standard);
	public void showAttendance();
}
