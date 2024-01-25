package com.switchstatements;

public class BreakAndContinue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i==6){
				break;
			}else{
				System.out.println(i);
			}
		}
		
		
		System.out.println("_______________________________________");
		for(int i=1;i<=10;i++){
			for(int j=11;j<=15;j++){
				if(j==13)break;
					System.out.println(i+" "+j);
				}
			}
		
		System.out.println("__________________________________________");
		for(int i=1;i<=10;i++){
			if(i==5)continue;
			System.out.println(i);
		}
		}

	}


