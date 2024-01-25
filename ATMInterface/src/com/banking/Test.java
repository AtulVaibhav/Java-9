package com.banking;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Welcome to ABC_Bank----------");
		char res;
		do{
			System.out.println("1.deposit    2.withdraw     3.balEnquiry");
			System.out.println("Select any operation.");
			int option = sc.nextInt();
			switch(option){
			case 1:System.out.println("Enter the amount to deposit");
			       int depositAmount = sc.nextInt();
			       String depositStatus = ATMHelper.depositAmount(depositAmount);
			       System.out.println(depositStatus);
			       break;
			       
			case 2:System.out.println("Enter the amount to withdraw");
		           int withdrawAmount = sc.nextInt();
		           String withdrawStatus = ATMHelper.withdrawAmount(withdrawAmount);
		           System.out.println(withdrawStatus);
		           break;
		           
		           
			case 3: int balAmount = ATMHelper.balQuery();
			        System.out.println("Available balance :"+balAmount);
			        break;
			
			default:System.out.println("Invalid option...");
			}
			
			System.out.println("Do you want to continue?y/n");
			res = sc.next().charAt(0);

		    }while(res=='y');
		
		 System.out.println("Thank you for visiting ABC_Bank ATM");
		
	}

}
