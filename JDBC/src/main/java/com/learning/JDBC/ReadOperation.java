package com.learning.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperation {
    public static void readData() throws ClassNotFoundException, SQLException{
    	String sql = "select * from student";
    	
    	Connection con = Test.getConnection();
    	Statement stmt = con.createStatement();
    	ResultSet resultSet =stmt.executeQuery(sql);
    	System.out.println("Student records");
    	System.out.println("___________________________________");
    	while(resultSet.next()){
    		System.out.println("StudentId :"+resultSet.getInt(1)+"  StudentName :"+resultSet.getString(2)+" Course:"+resultSet.getString(3));
    	}
    }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		readData();

	}

}
