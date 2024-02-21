package com.abstraction;

abstract class Vehicle{
	public String brandName(){
		return "Tata-Motors";
	}
	
	public abstract int speed();
}

class Two_Wheeler extends Vehicle{
	public int speed(){
		return 70;
	}
}


public class Test {

	public static void main(String[] args) {
		Two_Wheeler obj = new Two_Wheeler();
		System.out.println(obj.brandName());
		System.out.println(obj.speed());

	}

}
