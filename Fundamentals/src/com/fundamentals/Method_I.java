package com.fundamentals;

/**
 * Methods in Java -Block of code to perform some task. 
 * -Every method should be responsible for performing a single task. 
 * -Methods allow you to reuse a block of code again and again. 
 * -It also increases readability of code.
 * 
 * General Syntax: public return_type nameOfFn(args_list){ 
 * //body of function 
 * }
 * 
 * Based on Accessibility: Methods are classified into two categories:
 * 1.non-static method: through object 
 * 2.static method: through className. 
 */
public class Method_I {
	
	// method-definition
	public void m1(){
		System.out.println("m1() executed...");
	}
	
	public int squareOfNumber(int num){
		return num*num;
		
	}
	
	public static void m2(){
		System.out.println("static m2() executed...");
	}
	
	public static String greet(String name){
		return "Good Morning "+name;
	}

	public static void main(String[] args) {
		Method_I obj = new Method_I();
		obj.m1();//calling a function or invoking a function
        int result = obj.squareOfNumber(3);
        System.out.println(result);
        
        Method_I.m2();
        
        String result2 = Method_I.greet("Akash");
        System.out.println(result2);
        
	}

}
