package com.core.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryCreateTable {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(Constants.JDBC_URL, Constants.USERNAME,
					Constants.PASSWORD);
			System.out.println("Connected to the PostgreSQL Server");

			Statement statement = connection.createStatement();
			statement.executeUpdate("CREATE TABLE learning (id serial PRIMARY KEY, topic VARCHAR(100));");
			statement.close();

			connection.close();
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}

		System.out.println("Table Created Successfully");
	}

}
