package com.fundamentals;

class Vehicle{
	int wheels;
	String name;
	
	Vehicle(int numberOfWheels,String carName){
		wheels = numberOfWheels;
		name = carName;
	}
	
	Vehicle(Vehicle obj){
		wheels = obj.wheels;
		name = obj.name;
	}
	
	public void display(){
		System.out.println("Wheels :"+this.wheels+" Name :"+this.name);
	}
}


public class Constructor_III {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(4,"RangeRover");
		v1.display();
		
		Vehicle v2 = new Vehicle(v1);
         v2.display();
	}

}
