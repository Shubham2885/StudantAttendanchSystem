package com.bridgelazs.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bridgelazs.entity.Student;

public class StudentRepository implements IStudentRepository {

	private DBConnection dbConnection;
	public StudentRepository() {
		try {
			dbConnection = new DBConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int save(Student student) {
		try {
			Connection connection = dbConnection.getConnection();
			final String insertQuery = "insert into student(firstName, lastName, mobileNo, standard) values (?, ?, ?, ?)";

			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, student.getFirstName());
			preparedStatement.setString(2, student.getLastName());
			preparedStatement.setString(3, student.getMobileNo());
			preparedStatement.setString(4, student.getStandard());
			
			int rollNo = preparedStatement.executeUpdate();
			System.out.println(rollNo);
		}catch(SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return 0;
	}

	@Override
	public List<Student> getAllStudents() {
		final List<Student> students = new ArrayList<Student>();
		try {
		Connection connection = dbConnection.getConnection();
		//3rd create statement
		Statement statement = connection.createStatement();

		final String query = "select * from student";

		//4th execute the query and get the result set obj
		ResultSet resultSet =  statement.executeQuery(query);

		while(resultSet.next()) {
			Student student = new Student();
			student.setRollNo(resultSet.getInt("rollNo"));
			student.setFirstName(resultSet.getString("firstName"));
			student.setLastName(resultSet.getString("lastName"));
			student.setStandard(resultSet.getString("standard"));
			student.setMobileNo(resultSet.getString("mobileNo"));
			students.add(student);
		}

		//5th close connection
		resultSet.close();
		statement.close();
//		connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return students;
	}

}
