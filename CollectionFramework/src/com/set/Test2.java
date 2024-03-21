package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		//insertion order is maintained
		Set<String> set = new LinkedHashSet<>();
		set.add("Ankit");
		set.add("Harsh");
		set.add("Amar");
		
		System.out.println(set);
		
		//duplicates are not allowed
		set.add("Amar");
		System.out.println(set);
		
		//null is allowed
		set.add(null);
		System.out.println(set);

	}

}
