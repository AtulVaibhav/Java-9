package com.multiDimensionalArray;

public class Problem1 {
  public void searchElement(int[][]arr,int element){
	  for(int i=0;i<arr.length;i++){
		  for(int j=0;j<arr[i].length;j++){
			  if(arr[i][j]==element){
				  System.out.println(i+" "+j);
			  }
		  }
	  }
  }
	public static void main(String[] args) {
		int[][] arr = {{21,22,23},{42,45,41},{26,29,19}};
        Problem1 obj = new Problem1();
        obj.searchElement(arr, 41);
	}

}
