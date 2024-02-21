package com.abstraction;

interface X{
	void m1();
}

interface Y{
	void m2();
}

interface Z extends X,Y{
	
}

class Zimpl implements Z{
	public void m1(){
		System.out.println("method from X");
	}
	
	public void m2(){
		System.out.println("method from Y");
	}
}

public class Test3 {

	public static void main(String[] args) {
		Zimpl obj = new Zimpl();
		obj.m1();
		obj.m2();
	}

}
