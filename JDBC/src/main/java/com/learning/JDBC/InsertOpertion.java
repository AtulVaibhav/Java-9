package com.learning.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOpertion {
   public static void insertData() throws ClassNotFoundException, SQLException{
	   String sql = "insert into student values(103,'Vivek','Web')";
	   
	   //create connection
	   Connection con = Test.getConnection();
	   
	   //create statement
	   Statement stmt = con.createStatement();
	   
	   //executing sql
	   int i=stmt.executeUpdate(sql);
	   if(i>0){
		   System.out.println("Data inserted successfully");
	   }else{
		   System.out.println("Something went wrong");
	   }
	   
   }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	insertData();

	}

}
