package com.statements;

public class Test14 {
    public static int numberOfChocolates(int X,int Y ,int Z) {
    	int count=0;
    	int total_5rupeesCoin = X *5;
    	int total_10rupeesCoin = Y *10;
    	int amount = total_5rupeesCoin + total_10rupeesCoin;
    	count = amount/Z;
    	return count;
    }
	public static void main(String[] args) {
		System.out.println(numberOfChocolates(2, 3, 10));

	}

}
