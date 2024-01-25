package com.fundamentals;

class Car{
	int wheels;
	String name;
	
	Car(int wheels,String name){
		this.wheels = wheels;
		this.name = name;
	}
	
	public void m1(){
		
	}
	public void show(){
		System.out.println("Wheels:"+this.wheels+" Name :"+this.name);
		this.m1();
	}
}


public class This_keyword_II {

	public static void main(String[] args) {
		Car c = new Car(4,"Santro");
		c.show();

	}

}
