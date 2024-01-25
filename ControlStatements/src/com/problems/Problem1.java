package com.problems;

public class Problem1 {
    public void isEven(int num){
    	if(num%2==0){
    		System.out.println(num+" is an even number");
    	}else{
    		System.out.println(num+" is an odd number");
    	}
    }
	public static void main(String[] args) {
		Problem1 obj = new Problem1();
		obj.isEven(14);

	}

}
