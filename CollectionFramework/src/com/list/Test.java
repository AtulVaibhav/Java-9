package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        
		//Adding elements
		list.add(12);
		list.add(10);
		list.add(1);
		
		//list.add("hello");
		
		System.out.println(list);
		
		//duplicates are allowed
		
		list.add(12);
		System.out.println(list);
		
		//null is allowed
		list.add(null);
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(120);
	
		list.addAll(list2);
		System.out.println(list);
		
		
		//Accessing elements:indexing:get(index)
		System.out.println(list.get(2));
		
		//length of list
		 System.out.println(list.size());
		 
		
	    //update 
		 list.set(2, 10);
		 System.out.println(list);
		 
		 
		//checking
		 System.out.println(list.contains(100));
		
		 //search indexOf: first appearing.   lastIndexOf-
		System.out.println(list.indexOf(130));
		System.out.println(list.lastIndexOf(10));
		
		
		//remove
		list.remove(0);
		System.out.println(list);
		
		//System.out.println(list.remove(10));
		
		//traversal
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		for(Integer data:list){
			System.out.print(data+" ");
		}
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
	}

}
