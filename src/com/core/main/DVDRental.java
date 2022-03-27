package com.core.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DVDRental {

	public static void main(String[] args) {

		String jdbcURL = "jdbc:postgresql://localhost:5432/dvdrental";
		String username = "postgres";
		String password = "password";

		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);

			System.out.println("Connected to the PostgreSQL Server");

			connection.close();
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}

	}

}
