package com.learning.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {
   public static void updateData() throws ClassNotFoundException, SQLException{
	   String sql = "update student as s set s.courseName='webDevelopment' where s.studentId=103";
	   Connection con = Test.getConnection();
	   Statement stmt = con.createStatement();
	   int i = stmt.executeUpdate(sql);
	   if(i>0){
		   System.out.println("Row updated successfully");
	   }else{
		   System.out.println("Something went wrong");
	   }
	   
   }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		updateData();

	}

}
