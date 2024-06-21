package com.statements;

//if

public class Test {
    public static boolean isEven(int num) {
    	boolean flag = false;
    	if(num%2==0) {
    		flag = true;
    	}
    	return flag;
    }
	public static void main(String[] args) {
		System.out.println(isEven(12));

	}

}
