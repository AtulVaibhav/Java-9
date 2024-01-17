package com.fundamentals;

public class TypeCasting {

	public static void main(String[] args) {
		
		System.out.println("lower-higher : Implicit typeCasting");
		byte a = 10;
		int b = a;
		
		System.out.println("higher-lower : Explicit typeCasting");
		int x = 200;
		byte y = (byte)x;
		System.out.println(y);

	}

}
