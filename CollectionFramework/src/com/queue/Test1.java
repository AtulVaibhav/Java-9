package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(12);
		queue.add(11);
		queue.add(14);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		
		System.out.println(queue);
		
        int key=14;
        Iterator<Integer> itr = queue.iterator();
        while(itr.hasNext()){
        	if(itr.next()==key){
        		System.out.println(key);
        		break;
        	}
        }
	}

}
