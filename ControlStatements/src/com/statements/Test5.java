package com.statements;

import java.util.Scanner;
//final: if variable is declared as final,once initialized 
//it can't be changed.
class DB{
	static final String storedUsername ="admin";
	static final String storedPassword = "admin";
}

class LoginSystem{
	public static void validation(Scanner sc) {
		System.out.println("Enter the username");
		String username = sc.next();//admin
		if(username.equals(DB.storedUsername)) {
			   
			System.out.println("Enter the password");
			String password = sc.next();
			if(password.equals(DB.storedPassword)){
				System.out.println("Welcome "+username);
			}else {
				System.out.println("Invalid password");
			}
		}else {
			System.out.println("Invalid user");
		}
		
	}
}


public class Test5 {

	public static void main(String[] args) {
		LoginSystem.validation(new Scanner(System.in));
	}

}
