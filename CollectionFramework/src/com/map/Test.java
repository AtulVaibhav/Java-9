package com.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
	 Map<String,Integer> map = new HashMap<>();
	 //adding
	 map.put("Amar",24);
	 map.put("Surbhi", 22);
	 
	 System.out.println(map);
	 
	 //if duplicate key is there
	 map.put("Amar", 45);
	 System.out.println(map);
	 
	 //null as key
//	 map.put(null, 101);
//	 System.out.println(map);
//	 
	 //null as value
	 map.put("Pawan", null);
	 System.out.println(map);
	 
	 
	 //Iteration
	 for(Map.Entry<String, Integer> entry:map.entrySet()){
		 System.out.println(entry.getKey()+" "+entry.getValue());
	 }
	 
	 //searching for key:containsKey
	 if(map.containsKey("Amar")){
		 System.out.println(map.get("Amar"));
	 }
	 
	 

	}

}
