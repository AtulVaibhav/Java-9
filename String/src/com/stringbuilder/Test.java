package com.stringbuilder;

public class Test {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		System.out.println(builder.capacity());
        builder.append("Java");
        System.out.println(builder);
        
        System.out.println(builder.insert(1, "Hello"));
        System.out.println(builder.replace(1, 5, "World"));
        System.out.println(builder.delete(1, 5));
        
        System.out.println(builder.reverse());
        
	}

}
