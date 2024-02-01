package com.multiDimensionalArray;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int col = sc.nextInt();
		
		//declare an array
		int[][] arr = new int[row][col];
		
		//insert elements in the array
		
		System.out.println("Enter the elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("______________________________");
		System.out.println("Displaying elements:");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}	
	}

}
