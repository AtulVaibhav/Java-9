package com.learning.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	public static void deleteData() throws ClassNotFoundException, SQLException{
		   String sql = "delete from student where studentId=103";
		   Connection con = Test.getConnection();
		   Statement stmt = con.createStatement();
		   int i = stmt.executeUpdate(sql);
		   if(i>0){
			   System.out.println("Row deleted successfully");
		   }else{
			   System.out.println("Something went wrong");
		   }
		   
	   }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		deleteData();

	}

}
