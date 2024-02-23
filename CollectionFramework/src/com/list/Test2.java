package com.list;

import java.util.LinkedList;

public class Test2 {
	static LinkedList<Integer> linkedList;
	static {
	   linkedList = new LinkedList<>();
	}
   public static void printList(){
	   System.out.print("Head -->");
	   for(Integer data:linkedList){
		   System.out.print(data+" --->");
	   }
	   System.out.print("null");
	   System.out.println();
   }
	public static void main(String[] args) {
		//adding elements:
		for(int i=0;i<=5;i++){
			linkedList.add(i*i);
		}
		printList();
		
		//adding at first position
		linkedList.addFirst(100);
		printList();
		
		//adding at given position
		linkedList.add(3, 500);
		printList();
		
		
		//adding at end
		linkedList.addLast(1000);
		printList();
		
		//read element:
		System.out.println(linkedList.get(2));
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.peek());
		
		
		//update
		linkedList.set(1, 200);
       printList();
       
       
       //delete
       System.out.println(linkedList.remove(1));
       printList();
       
       System.out.println(linkedList.poll());
       printList();
       
       System.out.println(linkedList.pollFirst());
       printList();
       
       System.out.println(linkedList.pollLast());
       printList();
	}

}
