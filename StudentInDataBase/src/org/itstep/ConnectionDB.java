package org.itstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	private final static String URL = "jdbc:postgresql://localhost:5433/sokolov";
	private final static String LOGIN = "postgres";
	private final static String PASSWORD = "student";
	
	public static Connection getConnection() {
		Connection connection = null;
			try {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return connection;
	}
}