package com.fundamentals;

/**----------Instance Variable------------
 * variables defined outside method
 * it can be accessed using object only
 * every object is maintaining its own copy of instance variable
 * Syntax to access instance variable: objeName.varName;
 * 
 *
 */

public class Variables_I {
    int a = 10;//instance variable
	public static void main(String[] args) {
	   //creating an object: ClassName objName = new ClassName();
		Variables_I obj = new Variables_I();
		//System.out.println(obj);
		System.out.println("Current value of a for obj:"+obj.a);
		
		
		Variables_I obj2 = new Variables_I();
		System.out.println("Current value of a for obj2:"+obj2.a);
		
		System.out.println("------After modification----");
		obj.a = 20;
		System.out.println("Current value of a for obj:"+obj.a);
		System.out.println("Current value of a for obj2:"+obj2.a);
		

	}

}
