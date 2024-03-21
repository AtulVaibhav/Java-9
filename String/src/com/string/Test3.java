package com.string;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		//method
		//length():
		String str = "Java";
		System.out.println(str.length());
		
		//concat()
		String str1 = str.concat("World");
		System.out.println(str1);
		
		//charAt(index):
		System.out.println(str1.charAt(1));
		
		//indexof(char):
		System.out.println(str1.indexOf('a'));
		
		//lastindexOf
		System.out.println(str1.lastIndexOf('a'));
		
		//subString
		System.out.println(str1.substring(1,5));
		
		//toUpperCase
		System.out.println(str1.toUpperCase());
		
		
		//toLowerCase
		System.out.println(str1.toLowerCase());
		
		
		//toCharArray
		char[] arr = str1.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		//split
		String str2 = "I love programming";
		String[] ar = str2.split(" ");
		System.out.println(Arrays.toString(ar));
		
		
		//equals:compare content of two string objects
		String str3 = "Hello";
		String str4 = "Hello";
		System.out.println(str3.equals(str4));
		
		//==
		System.out.println(str3==str4);
		
		//compareTo
		String str5 = "apple";//97
		String str6 = "APPLE";//65
		System.out.println(str5.compareTo(str6));
		
	}

}
