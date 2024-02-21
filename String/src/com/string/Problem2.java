package com.string;

public class Problem2 {
	public static String reverseString(String str){
		   String revString="";
		   for(int i=str.length()-1;i>=0;i--){
			   revString += str.charAt(i);
		   }
		   return revString;
	   }
	public static void main(String[] args) {
		String str = "madam";
		String revString = reverseString(str);
		if(str.equals(revString)){
			System.out.println("is palindrome");
		}else{
			System.out.println("Not a palindrome");
		}

	}

}
