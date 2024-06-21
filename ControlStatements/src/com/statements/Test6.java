package com.statements;

public class Test6 {
    public static void print(int num) {
    	for(int i=1;i<=10;i++) {
    		System.out.println(num+"X"+i+"="+(num*i));
    	}
    }
    
    public static void divisor(int num) {
    	for(int i=2;i<=num/2;i++) {
    		if(num%i==0)
    			System.out.print(i+" ");
    	}
    }
	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			System.out.print(i+" ");
//		}
       // print(5);
		divisor(36);
	}

}
