package com.singleDimensionalArray;

public class SumOfElements {
    public int sumOfElements(int[] ar){
    	int sum=0;
    	for(int i=0;i<ar.length;i++){
    		sum = sum+ar[i];
    	}
    	return sum;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
        SumOfElements obj = new SumOfElements();
        int result=obj.sumOfElements(arr);
        System.out.println("Sum of elements :"+result);
	}

}
