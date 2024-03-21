package com.set;

import java.util.Set;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		//insertion is done in sorted way
		Set<String> set = new TreeSet<>();
		set.add("Varun");
		set.add("Aman");
		set.add("Vikram");
		set.add("Joe");
		System.out.println(set);
		
		//duplicates not allowed
		set.add("Joe");
		System.out.println(set);
		
		//null not allowed
		set.add(null);
		System.out.println(set);

	}

}
