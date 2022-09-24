package com.bridgelazs.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private Connection connection;
	
	public DBConnection() throws ClassNotFoundException, SQLException {
		//1st load the driver...
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded..");

		//2nd Connection
		final String username = "root";
		final String password = "mysql";
		final String baseUrl = "jdbc:mysql://";
		final String hostUrl = "localhost:3306/";
		final String databaseName = "student_attendance_system";
		final String finalUrl = baseUrl+hostUrl+databaseName;

		connection = DriverManager.getConnection(finalUrl, username, password);
		System.out.println("Connection Successful...");
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	
	/*

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//3rd create statement
		Statement statement = connection.createStatement();

		final String query = "select * from student";
		final String insertQuery = "insert into student(firstName, lastName, mobileNo) values ('Golu', 'Kawale', '89746884')";

		statement.executeUpdate(insertQuery);

		//4th execute the query and get the result set obj
		ResultSet resultSet =  statement.executeQuery(query);

		while(resultSet.next()) {
			System.out.println("*************Student Detail******************");
			System.out.println("Roll No = "+resultSet.getInt("rollNo"));
			System.out.println("firstName = "+resultSet.getString("firstName"));
			System.out.println("lastName = "+resultSet.getString("lastName"));
			System.out.println("mobileNo = "+resultSet.getString("mobileNo"));
		}

		//5th close connection
		resultSet.close();
		statement.close();
		connection.close();
	}
	*/
}
