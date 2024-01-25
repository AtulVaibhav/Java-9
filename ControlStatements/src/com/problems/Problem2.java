package com.problems;

public class Problem2 {
    public void isPositiveEvenNumber(int num){
    	if(num>0 && num%2==0){
    		System.out.println(num+" is a positive even number");
    	}else{
    		System.out.println(num+" is not a positive even number");
    	}
    }
	public static void main(String[] args) {
		Problem2 obj = new Problem2();
		obj.isPositiveEvenNumber(2);

	}

}
