package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionUtil{
	private static final String url="jdbc:mysql://localhost:3306/jdbc_data";
	private static final String username="root";
	private static final String password="root";
	public static String getUrl() {
		return url;
	}
	public static String getUsername() {
		return username;
	}
	public static String getPassword() {
		return password;
	}

}


public class Test {
	static Connection con=null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(con==null){
			con = DriverManager.getConnection(ConnectionUtil.getUrl(),ConnectionUtil.getUsername(),ConnectionUtil.getPassword());
		}
		return con;
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnection());

	}

}
