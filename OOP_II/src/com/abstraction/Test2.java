package com.abstraction;


interface A{
	int a = 10;//public,static and final
	
	String getName();//public & abstract
	
	public default void m1(){
		System.out.println("default method is called");
	}
	
	public static void m2(){
		System.out.println("static method is called");
	}
}

class B implements A{
	public String getName(){
		return "java";
	}
}

public class Test2 {

	public static void main(String[] args) {
		System.out.println(A.a);
		
		//A a = new A();
		B b = new B();
		System.out.println(b.getName());
		b.m1();
		A.m2();
		
	}

}
