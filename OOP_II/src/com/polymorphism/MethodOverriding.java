package com.polymorphism;


class Parent{
	public void m1(){
		System.out.println("Parent --->"+(10*10));//100
	}
}

class Child extends Parent{
	@Override //m1() method has been overridden in class Child 
	public void m1(){
		System.out.println("Child---->"+(10+10));//20
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
	}

}




