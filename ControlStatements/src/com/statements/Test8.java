package com.statements;

public class Test8 {
    static int count=0;
//    public static int countOfDigigt(int n) {
//    	while(n>0) {
//    		int rem = n%10;
//    		count++;
//    		n = n/10;
//    	}
//    	return count;
//    }
    
    public static int recursiveCall(int m) {
    	if(m==0) return count;
    	int rem = m%10;
    	count++;
    	return recursiveCall(m/10);
    }
    
	public static void main(String[] args) {
		//System.out.println(countOfDigigt(875432));
		System.out.println(recursiveCall(875432));
	}

}
