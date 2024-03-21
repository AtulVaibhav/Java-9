package com.employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeUtil {
   private static final String url="jdbc:mysql://localhost:3306/jdbc_data";
   private static final String username="root";
   private static final String password="root";
   private static Connection con=null;
   private static Connection getConnection() throws ClassNotFoundException, SQLException{
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  if(con==null){
		  con = DriverManager.getConnection(url,username,password);
	  }
	  return con;
   }
   
   
   public static String addEmployee(Scanner sc) throws ClassNotFoundException, SQLException{
	   System.out.println("Enter the employee id:");
	   int id = sc.nextInt();
	   
	   System.out.println("Enter the employee name");
	   String name = sc.next();
	   
	   System.out.println("Enter the employee dept");
	   String dept = sc.next();
	   
	   String query = "insert into employee values (?,?,?)";
	   PreparedStatement ps = getConnection().prepareStatement(query);
	   ps.setInt(1, id);
	   ps.setString(2, name);
	   ps.setString(3, dept);
	   
	   int i=ps.executeUpdate();
	   if(i>0){
		   return "Employee added successfully";
	   }
	   return "Something went wrong";
	   
   }
   
   public static void getEmployee() throws ClassNotFoundException, SQLException{
	   Statement stmt = getConnection().createStatement();
	   String query = "select * from employee";
	   ResultSet resultSet = stmt.executeQuery(query);
	   System.out.println("-------Employee details-------");
	   while(resultSet.next()){
		   System.out.println("Id:"+resultSet.getInt(1)+" Name:"+resultSet.getString(2)+" Dept:"+resultSet.getString(3));
	   }   
   }
   
   public static void getEmployeeById(Scanner sc) throws ClassNotFoundException, SQLException{
	   System.out.println("Enter the id of employee");
	   int id =sc.nextInt();
	   String query = "select * from employee where empId=?";
	   PreparedStatement ps = getConnection().prepareStatement(query);
	   ps.setInt(1, id);
	   ResultSet resultSet = ps.executeQuery();
	   while(resultSet.next()){
		   System.out.println("Id:"+resultSet.getInt(1)+" Name:"+resultSet.getString(2)+" Dept:"+resultSet.getString(3));
	   } 
   }
   
   public static String updateEmployee(Scanner sc) throws ClassNotFoundException, SQLException{
	   System.out.println("Enter the id of employee you want to update");
	   int id = sc.nextInt();
	   
	   System.out.println("Enter the name of employee");
	   String name = sc.next();
	   System.out.println("Enter the dept");
	   String dept = sc.next();
	   
	   String query = "update employee as e set e.empName=?, e.deptName=? where e.empId=?";
	   PreparedStatement ps = getConnection().prepareStatement(query);
	   ps.setString(1, name);
	   ps.setString(2,dept);
	   ps.setInt(3, id);
       
	   int i=ps.executeUpdate();
	   if(i>0){
		   return "Employee updated successfully";
	   }
	   return "something went wrong";   
   }
   
   public static String deleteEmployee(Scanner sc) throws ClassNotFoundException, SQLException{
	   System.out.println("Enter the id of employee to delete");
	   int id = sc.nextInt();
	   String query = "delete from employee where empId=?";
	   PreparedStatement ps = getConnection().prepareStatement(query);
	   ps.setInt(1, id);
	   int i = ps.executeUpdate();
	   if(i>0){
		   return "Employee deleted successfully";   
	   }
	   return "Something went wrong";   
   }
   
   
}
