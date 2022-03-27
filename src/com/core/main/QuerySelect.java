package com.core.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuerySelect {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(Constants.JDBC_URL, Constants.USERNAME,
					Constants.PASSWORD);

			System.out.println("Connected to the PostgreSQL Server");

			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("Select * from actor limit 5;");

			int actorID;
			String firstName, lastName, lastUpdate;

			while (result.next()) {
				actorID = result.getInt("actor_id");
				firstName = result.getString("first_name");
				lastName = result.getString("last_name");
				lastUpdate = result.getString("last_update");

				System.out.println("Actor ID - " + actorID);
				System.out.println("First Name - " + firstName);
				System.out.println("Last Name - " + lastName);
				System.out.println("Last Update - " + lastUpdate);
				System.out.println();
			}

			statement.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}

	}
}
