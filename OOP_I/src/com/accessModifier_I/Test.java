package com.accessModifier_I;

public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.age);
		
		//System.out.println(student.city);
		
		System.out.println(student.course);
		
		Child ch = new Child();
		System.out.println(ch.course);
	}

}
