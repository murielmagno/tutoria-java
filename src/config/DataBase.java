package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/escola";
	final String DB_USERNAME = "postgres";
	final String DB_PASSWORD = "123";

	public Connection conect() {
		try {
			return DriverManager.getConnection(DB_CONNECTION, DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
