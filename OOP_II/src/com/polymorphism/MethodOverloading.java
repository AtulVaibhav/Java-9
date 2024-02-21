package com.polymorphism;

class Dimension{
	
	public void area(){
		System.out.println("area without args");
	}
	public void area(int a){
		System.out.println("area with one args");
	}
	public void area(String a){
		System.out.println("area with one arg of type String");
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.area(10);

	}

}
