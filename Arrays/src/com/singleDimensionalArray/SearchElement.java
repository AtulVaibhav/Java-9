package com.singleDimensionalArray;

public class SearchElement {
    public int searchElement(int[] arr,int key){
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==key){
    			return i;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		int[] arr = {1,4,2,8,6,5,9,0};
		int key = 16;
		SearchElement obj = new SearchElement();
		int result = obj.searchElement(arr, key);
		if(result>0){
			System.out.println("Key element found at index :"+result);
		}else{
			System.out.println("Key element not found");
		}

	}

}
