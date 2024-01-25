package com.fundamentals;

class Employee{
	
	public  Employee(){
		System.out.println("Object created by calling constructor");
	}
}


public class Constructor_I {

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println(obj);
        
	}

}
