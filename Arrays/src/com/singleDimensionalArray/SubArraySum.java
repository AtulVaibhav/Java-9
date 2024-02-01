package com.singleDimensionalArray;

public class SubArraySum {
public void getSubArray(int[] arr,int targetSum){
	for(int i=0;i<arr.length;i++){
		int currentSum=0;
		for(int j=i;j<arr.length;j++){
			currentSum = currentSum +arr[j];
			if(currentSum==targetSum){
				System.out.println(i+" "+j);
				return;
			}
		}
	}
}
	public static void main(String[] args) {
		int[] arr = {1,4,20,3,6,30,11};
		int targetSum = 33;
		new SubArraySum().getSubArray(arr, targetSum);

	}

}
