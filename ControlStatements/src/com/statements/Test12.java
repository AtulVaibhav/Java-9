package com.statements;

public class Test12 {

	public static void main(String[] args) {
		//break;
		
		for(int i=1;i<=10;i++) {
			if(i==6) break;
			System.out.print(i+" ");
		}
		System.out.println("___________________");
		
		for(int i=1;i<=3;i++) {
			if(i==2) break;
			for(int j=4;j<=6;j++) {
				
				System.out.println(i+" "+j);
			}
		}
		
		
		System.out.println("___________________");
		for(int i=100;i<=105;i++) {
			if(i==102) continue;
			break;
		}
		
		

	}

}
