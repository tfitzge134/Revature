package com.app;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//downlaod drivers
		Connection connection = null;
		try {
			
  Class.forName("org.postgresql.Driver");
  System.out.println("Driver loaded succesfully");
  //step 2 open connection
  String url = "jdbc:postgresql://localhost:5432/player_schema";
  //jdbc:postgresql://{host}[:{port}]/[{database}]
  String username = "postgres";
  String password = "Printer@2007";
  
  connection = DriverManager.getConnection(url, username, password);
  System.out.println("connection succesful");
  
  Statement statement = connection.createStatement();
  String sql = "select id, name, age, city, gender"
  		+ " from player_schema.information_schema.player";
  		
  ResultSet resultset = statement.executeQuery(sql);
  System.out.println("query executed");
  //process result
  
  while(resultset.next()){
	  System.out.println("player id " + resultset.getInt("id"));
  }
  
  
	}catch(ClassNotFoundException e) {
		System.out.print(e);
		
	}catch(SQLException e) {
		System.out.println(e);
	}finally {
		try {
			connection.close();
			System.out.println("connection closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
}
