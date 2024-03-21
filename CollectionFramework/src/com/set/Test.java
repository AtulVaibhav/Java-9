package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		//insertion order is not maintained
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(7);
		System.out.println(set);
		
		
		//duplicates not allowed
		set.add(10);
		System.out.println(set);
		
		//null are allowed
		set.add(null);
		System.out.println(set);
		

	}

}
