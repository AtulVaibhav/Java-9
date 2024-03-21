package com.employee_management;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("------Employee Management System------");
		Scanner sc = new Scanner(System.in);
		char resp;
		do{
System.out.println("1.AddEmployee  2.GetEmployees  3.GetEmployeeById  4.UpdateEmployee   5.DeleteEmployee");
			System.out.println("Select any option");
			int option = sc.nextInt();
			switch(option){
			case 1:System.out.println(EmployeeUtil.addEmployee(sc));
			       break;
			       
			case 2:EmployeeUtil.getEmployee(); 
			       break;
			 
			case 3:EmployeeUtil.getEmployeeById(sc);
			       break;
			
			case 4:System.out.println(EmployeeUtil.updateEmployee(sc));
			       break;
			       
			case 5:System.out.println(EmployeeUtil.deleteEmployee(sc));
			       break;
			
			default:System.out.println("Invalid Option");
			}
			System.out.println("Do you want to continue?y/n");
			resp = sc.next().charAt(0);
		}while(resp=='y');
        System.out.println("Thank you!!!!");
	}

}
