package com.core.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDelete {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(Constants.JDBC_URL, Constants.USERNAME,
					Constants.PASSWORD);
			System.out.println("Connected to the PostgreSQL Server");

			Statement statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM learning WHERE id = 3;");
			statement.close();

			connection.close();
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}

		System.out.println("Record Deleted successfully");
	}
}
