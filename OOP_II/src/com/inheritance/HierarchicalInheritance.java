package com.inheritance;

class Employee{
	public String getCompanyName(){
		return "ABC Pvt.Ltd";
	}
}
class FullTimeEmployee extends Employee{
	public int getSalary(){
		return 45000;
	}
}

class PartTimeEmployee extends Employee{
	public int getSalary(){
		return 20000;
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee();
		System.out.println(fte.getCompanyName());
		System.out.println(fte.getSalary());
		System.out.println("_______________________");
		
		PartTimeEmployee pte = new PartTimeEmployee();
		System.out.println(pte.getCompanyName());
		System.out.println(pte.getSalary());

	}

}
