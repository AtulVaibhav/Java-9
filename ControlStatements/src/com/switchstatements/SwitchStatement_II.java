package com.switchstatements;

import java.util.Scanner;

public class SwitchStatement_II {
    public void add(int a,int b){
    	System.out.println(a+b);
    }
    public void sub(int a,int b){
    	System.out.println(a-b);
    }
    public void mul(int a,int b){
    	System.out.println(a*b);
    }
    
	public static void main(String[] args) {
		SwitchStatement_II obj = new SwitchStatement_II();
		System.out.println("Enter the option");
		System.out.println("1.add  2.sub   3.mul");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option){
		case 1:obj.add(12, 13);
		       break;
		case 2:obj.sub(12, 4);
		       break;
		case 3:obj.mul(12, 12);
		       break;
		default:System.out.println("invalid option");
		}

	}

}
