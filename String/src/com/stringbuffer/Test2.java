package com.stringbuffer;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//1.append
		sb.append("Java");
		System.out.println(sb);
		
		//2.length();
		System.out.println(sb.length());
		
		//3.insert()
		sb.insert(1, "World");
		System.out.println(sb);
		
       //4.replace
		sb.replace(1, 5, "Hello");
		System.out.println(sb);
		
		//5.delete
		sb.delete(1, 5);
		System.out.println(sb);
		
		
		//6.reverse()
		sb.reverse();
		System.out.println(sb);
	}

}
