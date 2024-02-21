package com.string;

public class Problem1 {
   public static String reverseString(String str){
	   String revString="";
	   for(int i=str.length()-1;i>=0;i--){
		   revString += str.charAt(i);
	   }
	   return revString;
   }
	public static void main(String[] args) {
		String str = "Welcome";
		System.out.println("Original String :"+str);
        System.out.println("Reversed String :"+reverseString(str));
	}

}
