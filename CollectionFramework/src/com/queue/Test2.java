package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test2 {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.add(10);
		deque.add(20);
		
		System.out.println(deque.peek());
		System.out.println(deque);
		
		//addFirst
		deque.addFirst(5);
		
		//addLast
		deque.addLast(30);
		
		System.out.println(deque);
		
		
		//peekFirst
		System.out.println(deque.peekFirst());
		
		//peekLast
		System.out.println(deque.peekLast());

	}

}
