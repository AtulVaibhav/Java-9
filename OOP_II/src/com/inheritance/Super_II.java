package com.inheritance;

class A{
	int a = 10;
}
class B extends A{
	int a = 20;
	public void show(){
		int a =30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Super_II {

	public static void main(String[] args) {
		B b = new B();
		b.show();
	}

}
