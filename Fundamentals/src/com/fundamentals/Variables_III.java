package com.fundamentals;
/**----------local Variable------------
 * variables defined inside method.
 * it can accessed within method only.
 * 
 * 
 *
 */
public class Variables_III {
    
	public void m1(){
		int a = 200;
		System.out.println(a);
	}
	public static void main(String[] args) {
		//System.out.println(Variables_III.a);
        Variables_III obj = new Variables_III();
//        System.out.println(obj.a);
        obj.m1();
        
        
	}

}
