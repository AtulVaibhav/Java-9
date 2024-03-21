package com.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
 public static Map<Integer,Integer> getFrequency(int[] arr){
	 Map<Integer,Integer> map = new HashMap<>();
	 for(int data:arr){
		 if(map.containsKey(data)){
			 map.put(data, map.get(data)+1);
		 }else{
			 map.put(data, map.getOrDefault(data, 1));
		 }
	 }
	 return map;
 }
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,3,1,2,2,2,4,4,3,5,5,5,6,6};
		System.out.println(getFrequency(arr));

	}

}
