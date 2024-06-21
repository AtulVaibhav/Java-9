package com.statements;

public class Test3 {
    public static boolean isPositiveEven(int num) {
    	if(num%2==0 && num>0) {
    		return true;
    	}
    	return false;
    }
	public static void main(String[] args) {
		System.out.println(isPositiveEven(24));

	}

}
