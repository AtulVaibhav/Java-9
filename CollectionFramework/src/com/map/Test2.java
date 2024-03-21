package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Vikram", 10);
		map.put("Anuj", 10);
		map.put("Vaibhav", 10);
		System.out.println(map);
		
		
		Map<String,Integer> map2 = new TreeMap<>();
		map2.put("Vikram", 10);
		map2.put("Anuj", 10);
		map2.put("Vaibhav", 10);
		System.out.println(map2);
	}

}
