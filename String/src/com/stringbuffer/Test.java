package com.stringbuffer;

public class Test {

	public static void main(String[] args) {
		//creating stringBuffer object:
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnopq");
		System.out.println(sb.capacity());
		
		//Mutable object
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Hello");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		sb1.append("World");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
	}

}
