package com.if_else;

public class Else_If_Ladder {
     public void m1(int num){
    	 if(num>=10){
    		 System.out.println("Statement1");
    	 }else if(num>=7 && num<10){
    		 System.out.println("Statement2");
    	 }else if(num>=3 && num<7){
    		 System.out.println("Statement3");
    	 }else{
    		 System.out.println("Statement4");
    	 }
     }
	public static void main(String[] args) {
      Else_If_Ladder obj = new Else_If_Ladder();
      obj.m1(8);

	}

}
