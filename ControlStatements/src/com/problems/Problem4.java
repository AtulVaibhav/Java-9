package com.problems;

public class Problem4 {
   public void gradeSystem(int marks){
	   if(marks>=80){
		   System.out.println("Distinction");
	   }else if(marks>=60 && marks<80){
		   System.out.println("First Class");
	   }else if(marks>=40 && marks<60){
		   System.out.println("Second class");
	   }else{
		   System.out.println("Try Again");
	   }
   }
	public static void main(String[] args) {
		Problem4 obj = new Problem4();
		obj.gradeSystem(57);

	}

}
