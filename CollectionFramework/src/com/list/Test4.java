package com.list;

import java.util.Stack;

public class Test4 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(12);
		stack.push(10);
		stack.push(11);
		stack.push(9);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());//9
		System.out.println(stack.peek());//11
		
		
		
		

	}

}
