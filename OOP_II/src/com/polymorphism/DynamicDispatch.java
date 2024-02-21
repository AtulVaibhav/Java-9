package com.polymorphism;

class P{
	
}

class C1 extends P{
	
}

class C2 extends P{
	
}
public class DynamicDispatch {

	public static void main(String[] args) {
		C1 obj = new C1();
		C2 obj2 = new C2();
		//C1 obj3 = new C2();
		
		P obj4 = new C1();
		P obj5 = new C2();
	}

}
