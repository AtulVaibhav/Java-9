package com.string;

public class Test2 {

	public static void main(String[] args) {
		
		//using literals
		String str = "Java";
		String str1 = "Java";
		String str2 = "java";
		String str3 = "JaVa";
		if(str==str2){
			System.out.println("Pointing to same object");
		}else{
			System.out.println("Points to different location");
		}
		System.out.println("_________________________________");
		//using new
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if(s1==s2){
			System.out.println("Same location");
		}else{
			System.out.println("Different location");
		}
     System.out.println("___________________________________");
     String s3 = "World";
     String s4 = new String("World");
     if(s3==s4){
			System.out.println("Same location");
		}else{
			System.out.println("Different location");
		}
     
     
     
     System.out.println("___________________________________");
	
	  String s5 ="python";
	  String s6 = new String("python");
	  s6 = s6.intern();
	  if(s5==s6){
		  System.out.println("Same location");
	  }else{
		  System.out.println("Different location");
	  }
	  
	  
	  
	
	
	}

}
