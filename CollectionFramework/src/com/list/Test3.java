package com.list;

import java.util.Iterator;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		System.out.println(vector.capacity());
		Vector<Integer> vector2 = new Vector<>(20);
		System.out.println(vector2.capacity());
		
		//adding
		for(int i=1;i<=5;i++){
			vector2.add(i*i);
		}
		System.out.println(vector2);
		
		//access element
		System.out.println(vector2.get(1));
	
		//traversal
		Iterator<Integer> itr = vector2.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//update
		vector2.set(1, 10);
		System.out.println(vector2);
		

		//delete
		vector2.remove(1);
		System.out.println(vector2);
		
		//checking
		System.out.println(vector2.contains(9));
		
		
		//search
       System.out.println(vector2.indexOf(9));
	}

}
