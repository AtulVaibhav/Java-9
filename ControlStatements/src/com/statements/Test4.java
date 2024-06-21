package com.statements;

public class Test4 {
    public static String getGrade(int num) {
    	if(num>=80) {
    		return "Marks Obtained "+num+" Grade: Distinction";
    	}else if(num>=60 && num<80) {
    		return "Marks Obtained "+num+" Grade: Ist division";
    	}else if(num>=40 && num<60) {
    		return "Marks Obtained "+num+" Grade: 2nd division";
    	}else if(num>=35 && num<40) {
    		return "Marks Obtained "+num+" Grade: 3rd division";
    	}else {
    		return "Try Again";
    	}
    }
	public static void main(String[] args) {
		System.out.println(getGrade(47));

	}

}
