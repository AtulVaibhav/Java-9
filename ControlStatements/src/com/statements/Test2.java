package com.statements;

public class Test2 {
    static boolean flag;
    
    public static boolean isOdd(int num) {
    	if(num%2==1) {
    		flag = true;
    	}else {
    		flag = false;
    	}
    	
    	return flag;
    }
	public static void main(String[] args) {
		System.out.println(isOdd(45));

	}

}
