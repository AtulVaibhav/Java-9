package com.fundamentals;
/**----------Static Variables-----------
 * static keyword is required to declare variable as static
 * static variables is related to class
 * it can accessed by className
 * Syntax: ClassName.varName;
 * Every object is sharing the same copy of static variables
 * Note: Static variables can also be accessed using object,but its not
 * recommended
 *
 */
public class Variables_II {
     static int data = 100;
	public static void main(String[] args) {
		System.out.println(Variables_II.data);
		
		System.out.println("Accessing static data using object");
		Variables_II obj1 = new Variables_II();
		System.out.println(obj1.data);
        //The static field Variables_II.data should be accessed in a static way
	
		Variables_II obj2 = new Variables_II();
		System.out.println("Static data for obj1:"+obj1.data);
		System.out.println("Static data for obj2:"+obj2.data);
		
		System.out.println("----------After modification-------------");
		obj1.data = 500;
		System.out.println("Static data for obj1:"+obj1.data);
		System.out.println("Static data for obj2:"+obj2.data);
	}

}
