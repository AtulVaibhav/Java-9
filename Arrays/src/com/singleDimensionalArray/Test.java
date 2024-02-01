package com.singleDimensionalArray;

class ArrayUtil{
	int[] arr;
	ArrayUtil(int size){
		arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = Integer.MAX_VALUE;
		}
	}
	
	public void readArray(){
		//how to traverse or iterate an array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public String insertElement(int indexPosition,int element){
		if(arr[indexPosition]==Integer.MAX_VALUE){
			arr[indexPosition] = element;
			return "Element added successfully";
		}
		return "Insert operation fails";
	}
	
	public int elementAtGivenPosition(int index){
		return arr[index];
	}
	
	public String updateArray(int indexPosition,int updatedValue){
		if(arr[indexPosition]!=Integer.MAX_VALUE){
			arr[indexPosition] = updatedValue;
			return "Data updated successfully";
		}
		return "Updation failed";
	}
	
	public String deleteElement(int indexPosition){
		if(arr[indexPosition]!=Integer.MAX_VALUE){
			arr[indexPosition] = Integer.MAX_VALUE;
			return "element deleted successfully";
		}
		return "Deletion failed";
	}
}

public class Test {
	public static void main(String[] args) {
		ArrayUtil obj = new ArrayUtil(5);
		obj.readArray();
		System.out.println(obj.insertElement(1, 100));
        obj.readArray();
        
        //System.out.println(obj.insertElement(10, 200));
        System.out.println(obj.elementAtGivenPosition(1));
        
        System.out.println(obj.updateArray(1,200));
        obj.readArray();
        
        System.out.println(obj.updateArray(2, 300));
	    System.out.println(obj.deleteElement(1));
	    obj.readArray();
	
	}

}
