package com.core.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryInsert {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(Constants.JDBC_URL, Constants.USERNAME,
					Constants.PASSWORD);
			System.out.println("Connected to the PostgreSQL Server");

			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO learning (topic) VALUES ('Fundamentals');");
			statement.executeUpdate("INSERT INTO learning (topic) VALUES ('Moderate');");
			statement.executeUpdate("INSERT INTO learning (topic) VALUES ('Advanced');");

			statement.close();

			connection.close();
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		System.out.println("Record/Records created successfully");
	}

}
