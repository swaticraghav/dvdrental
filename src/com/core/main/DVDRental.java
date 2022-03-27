package com.core.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DVDRental {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(Constants.JDBC_URL, Constants.USERNAME,
					Constants.PASSWORD);

			System.out.println("Connected to the PostgreSQL Server");

			connection.close();

		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}

	}

}
