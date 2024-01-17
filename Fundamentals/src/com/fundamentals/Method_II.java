package com.fundamentals;

public class Method_II {
    int data1 = 100;
    static int data2 = 200;
    
    public static void m1(){
    	//System.out.println(data1);
    	System.out.println(data2);
    }
    
    public void m2(){
    	System.out.println(data1);
    	System.out.println(data2);
    }
	public static void main(String[] args) {
		Method_II.m1();
		
		Method_II obj = new Method_II();
		obj.m2();

	}

}
