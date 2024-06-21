package com.statements;

public class PatternProblem {
    public static void rightAngledTriangle(int n) {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    
    public static void leftAngledTriangle(int n) {
    	for(int i=1;i<=n;i++) {
    		for(int j=i;j<n;j++) {
    			System.out.print("   ");
    		}
    		for(int k=1;k<=i;k++) {
    			System.out.print(" * ");
    		}
    		System.out.println();
    		}
    }
    
    
    
	public static void main(String[] args) {
		rightAngledTriangle(5);
        System.out.println("_____________________");
        leftAngledTriangle(5);
	}

}
