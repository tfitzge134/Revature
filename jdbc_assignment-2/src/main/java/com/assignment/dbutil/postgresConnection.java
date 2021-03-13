package com.assignment.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class postgresConnection {
	private static Connection connection;
	private postgresConnection() {
		
	}
public static Connection getConnection() throws ClassNotFoundException, SQLException {
	if(connection == null)
	{
	Class.forName("org.postgresql.Driver");
	System.out.println("Driver loaded succesfully");

	String url = "jdbc:postgresql://localhost:5432/player_schema";
	//jdbc:postgresql://{host}[:{port}]/[{database}]
	String username = "postgres";
	String password = "Printer@2007";

	connection = DriverManager.getConnection(url, username, password);
	return connection;
	
}else {
	return connection;
}
}
}
