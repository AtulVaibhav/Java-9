package com.singleDimensionalArray;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		//declaring an array
		int[] ar = new int[size];
		
		//insert element to array
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++){
			ar[i] = sc.nextInt();
		}
		
		//display element from an array
		System.out.println("________________________________");
		System.out.println("Displaying an array elements:");
		for(int i=0;i<size;i++){
			System.out.println(ar[i]);
		}
		

	}

}
