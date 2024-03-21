package com.learning.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
   public static void executeSQl() throws ClassNotFoundException, SQLException{
	   String sql = "show tables";
	   Connection con = Test.getConnection();
	   Statement stmt = con.createStatement();
	   ResultSet resultSet = stmt.executeQuery(sql);
	   while(resultSet.next()){
		   System.out.println(resultSet.getString(1));
	   }
   }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		executeSQl();

	}

}
