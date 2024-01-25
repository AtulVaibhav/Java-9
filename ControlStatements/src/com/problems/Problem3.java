package com.problems;

public class Problem3 {
	int username = 124;
	int password = 257;
	
    public void loginCredential(){
    	if(username==123){
    		if(password==256){
    			System.out.println("Welcome admin");
    		}else{
    			System.out.println("Wrong password");
    		}
    	}else{
    		System.out.println("Invalid user");
    	}
    }
	public static void main(String[] args) {
		Problem3 obj = new Problem3();
		obj.loginCredential();

	}

}
