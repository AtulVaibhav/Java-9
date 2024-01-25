package com.if_else;

public class Test {
    public void m1(int num){
    	if(num>2){
    		System.out.println("statement-1");
        	System.out.println("statement-2");
        	
    	}else{
    		System.out.println("statement-3");
        	System.out.println("statement-4");
    	}
    }
	public static void main(String[] args) {
		Test test = new Test();//creating an object
        test.m1(1);
	}

}
