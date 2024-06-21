package com.statements;

public class Test13 {
   public static void printPrime(int start,int end ) {
	  for(int num = start;num<=end;num++) {
		  boolean flag = false;
		  for(int i=2;i<=num/2;i++) { 
			  if(num%i==0) {
				  flag = true;
				  break;
			  }
			 
		  }
		  if(!flag) {
			  System.out.println(num);
		  }
		  
	  }
   }
	public static void main(String[] args) {
		printPrime(1,100);

	}

}
