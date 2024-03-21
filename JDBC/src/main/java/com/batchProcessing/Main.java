package com.batchProcessing;

import java.sql.SQLException;
import java.sql.Statement;
import com.learning.JDBC.*;
public class Main {
    public static void addMultipleValue() throws ClassNotFoundException, SQLException{
    	String q1 = "insert into student values(103,'Aman','web')";
    	String q2 = "insert into student values(104,'Vivek','testing')";
    	String q3 = "insert into student values(105,'Vijay','accounts')";
    	
    	Statement stmt = Test.getConnection().createStatement();
    	stmt.addBatch(q1);
    	stmt.addBatch(q2);
    	stmt.addBatch(q3);
    	
    	int[] i = stmt.executeBatch();
    	if(i.length>0){
    		System.out.println("Queries executed successfully");
    	}else{
    		System.out.println("Something went wrong");
    	}
    }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		addMultipleValue();

	}

}
