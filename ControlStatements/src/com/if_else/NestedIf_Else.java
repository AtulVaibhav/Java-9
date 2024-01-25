package com.if_else;

public class NestedIf_Else {
     public void m1(int num){ 
    	 if(num>0){
    		 if(num%2==0){
    			 System.out.println("statement 1");
    		 }else{
    			 System.out.println("statement 2");
    		 }
    	 }else{
    		 System.out.println("statement 3");
    	 }
     }
	public static void main(String[] args) {
		NestedIf_Else obj = new NestedIf_Else();
		//obj.m1(24);
		//obj.m1(19);
		obj.m1(-2);
	}

}
