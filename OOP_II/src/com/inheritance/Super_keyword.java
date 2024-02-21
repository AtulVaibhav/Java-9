package com.inheritance;

class Base{
	Base(int a){
		System.out.println("Base/Parent object created");
	}
}
class Derived extends Base{
	Derived(){
		super(10);
		System.out.println("Derived/Child object created");
	}
}
public class Super_keyword {

	public static void main(String[] args) {
		Derived derived = new Derived();
	}

}
