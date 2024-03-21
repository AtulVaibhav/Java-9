package com.methodReference;

@FunctionalInterface
interface A{
	void m1();
}

class Demo{
	public void a1(){
		System.out.println("function called");
	}
	
	public static void b1(){
		System.out.println("static function called");
	}
}

public class Test {

	public static void main(String[] args) {
//		Demo d = new Demo();
//		
//        A obj = d::a1;
//        obj.m1();
		
		
//		A obj = Demo::b1;
//		obj.m1();
		
		A obj = System.out::println;
		
	}

}
