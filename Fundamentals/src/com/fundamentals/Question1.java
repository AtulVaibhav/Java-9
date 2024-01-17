package com.fundamentals;

public class Question1 {
    int data = 100; //instance variable: object
    static int data2  = 200;// static variable: ClassName
    public void m1(){
    	int data3 = 300;  // local variable:within method
    	System.out.println(data3);
    }
	public static void main(String[] args) {
	  Question1 obj = new Question1();
	  System.out.println(obj.data);
	  
	  System.out.println(Question1.data2);
	  
	  obj.m1();

	}

}
