package com.banking;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Welcome to ABC Bank");
		Scanner sc  = new Scanner(System.in);
		char res;
		int counter=0;
		while(counter<4) {
			System.out.println("enter your secret key");
			int secretKey = sc.nextInt();
			if(secretKey==BankServer.getPin()) {
				do {
					System.out.println("Enter the option to continue");
					System.out.println("1.deposit  2.withdraw  3.balEnquiry");
					int option = sc.nextInt();
					switch(option) {
					case 1: 
						   System.out.println("Enter the amount to deposit");
						   int depositAmount =sc.nextInt();
						    BankUtil.deposit(depositAmount);
					        break;
					case 2: 
						   System.out.println("Enter the amount to withdraw");
						   int withdrawAmount =sc.nextInt();
						    BankUtil.withdraw(withdrawAmount);
					        break;
					case 3: BankUtil.balEnquiry();
					        break;
					default:System.out.println("Invalid option");
					}
					System.out.println("Do you want to continue?y/n");
					res = sc.next().charAt(0);
				}while(res=='y');
				System.out.println("Transaction completed..");
				break;
			}else {
				System.out.println("You have entered wrong pin");
				counter++;
				if(counter==3) {
					System.out.println("You have reached your maximum attempt");
					System.out.println("Connect to your nearest branch.");
				    break;
				}
			}
		}
		System.out.println("Thank you for using ABC service.");
		
		
	}

}
