package it.begear.traccia6.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionManager {
 static Connection getConnection() throws SQLException{
	 String url="jdbc:mysql://localhost:3306/magazzinopc?useSSL=false&serverTimezone=UTC";
	 String users="root";
	 String password="root";
	 return DriverManager.getConnection(url,users,password);
	 
 }
}