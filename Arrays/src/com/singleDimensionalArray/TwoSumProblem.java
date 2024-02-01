package com.singleDimensionalArray;

public class TwoSumProblem {
   public String findPair(int[]arr,int target){
	   for(int i=0;i<arr.length-1;i++){
		   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]+arr[j]==target){
				   return "firstIndex :"+i+" secondIndex :"+j;
			   }
		   }
	   }
	   return "No pair found";
   }
	public static void main(String[] args) {
		int[] arr={1,5,3,7,10,12,6,9};
		int target = 9;
        TwoSumProblem obj = new TwoSumProblem();
       String result= obj.findPair(arr, target);
       System.out.println(result);
	}

}
