package com.statements;

public class Test11 {
	public static void m1() {
		System.out.println("m1() executed");
	}

	public static void m2() {
		System.out.println("m2() executed");
	}

	public static void m3() {
		System.out.println("m3() executed");
	}

	public static void m4() {
		System.out.println("m4() executed");
	}

	public static void main(String[] args) {
		int option = 1;
		switch (option) {
		case 1:
			m1();
			break;
		case 2:
			m2();
			break;
		case 3:
			m3();
			break;
		case 4:
			m4();
			break;
		default:
			System.out.println("Invalid option");
		}

	}

}
