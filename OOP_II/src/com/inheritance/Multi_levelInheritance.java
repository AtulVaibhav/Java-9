package com.inheritance;

class Vehicle{
	public String speed(){
		return "120km/hr";
	}
}

class Four_Wheeler extends Vehicle{
	public int getWheels(){
		return 4;
	}
}

class Car extends Four_Wheeler{
	public String getName(){
		return "HondaCity";
	}
}


public class Multi_levelInheritance {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getName());
		System.out.println(car.getWheels());
		System.out.println(car.speed());

	}

}
