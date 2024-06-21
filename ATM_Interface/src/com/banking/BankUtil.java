package com.banking;

public class BankUtil {
   static final int minBal = 500;
   static int currentBal = minBal;
   
   public static void deposit(int depositedAmount){
	   if(depositedAmount<100) {
		   System.out.println("Amount should be greater than 100");
	   }else {
	   currentBal = currentBal + depositedAmount;
	   System.out.println("Amount depsited successfully");
	   }
   }
   
   
   public static void withdraw(int withdrawAmount) {
	   if((currentBal-minBal)>=withdrawAmount) {
		   currentBal = currentBal-withdrawAmount;
		   System.out.println("Amount debited successfully");
	   }else {
		   System.out.println("Insufficient balance");
	   }
   }
   
   public static void balEnquiry() {
	   System.out.println("The current balance :"+currentBal);
   }
   
   
   
}
