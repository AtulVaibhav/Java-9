package com.encapsulation;

class Employee{
	private int employeeId=101;
	
	public int getEmployeeId(){
		return this.employeeId;
	}
}

public class Test {

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println(obj.getEmployeeId());
	}

}
