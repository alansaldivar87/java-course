package com.tecgurus.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDB {
	private static String url = "jdbc:mysql://127.0.0.1:3306/";
	private static String database = "login";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String user = "root";
	private static String password = "root";

	public Connection openConnection() {   
		try {
			Class.forName(driver).newInstance();
			Connection connection = DriverManager.getConnection(url + database, user, password);
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
}
