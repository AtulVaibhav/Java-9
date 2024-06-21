package com.statements;

public class Test9 {
    public static int pow(int n,int m) {
    	int res = 1;
    	for(int i=1;i<=m;i++) {
    		res *=n;
    	}
    	return res;
    }
	public static void main(String[] args) {
		System.out.println(pow(2,3));

	}

}
