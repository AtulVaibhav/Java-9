package com.multiDimensionalArray;

public class Test {

	public static void main(String[] args) {
		//declare an array and defining
		
		int[][] ar = {{1,2,3},{11,12,13},{21,22,23}};
		
		//access elements:
		System.out.println(ar[1][1]);
		
       //traversing an array
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.println(ar[i][j]);
			}
		}
		System.out.println("_________________________________");
		//displaying an array in matrix format:
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
