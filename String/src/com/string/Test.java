package com.string;

public class Test {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println("__________________________________");
		str.concat("Java");
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println("__________________________________");
		//re-assignment
		str = str.concat("world");
		System.out.println(str);
		System.out.println(str.hashCode());

	}

}
