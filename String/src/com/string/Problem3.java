package com.string;

public class Problem3 {
   public static String revPosition(String str){
	   String[] arr = str.split(" ");
	   String rev = "";
	   for(int i=arr.length-1;i>=0;i--){
		  rev +=arr[i]+" ";
	   }
	   return rev;
   }
	public static void main(String[] args) {
		String str = "I love programming";
		System.out.println(revPosition(str));
	}

}
