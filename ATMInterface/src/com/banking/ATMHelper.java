package com.banking;

public class ATMHelper {
    private static int minBal = 500;
    private static int currentBal = minBal;
    
    public static String depositAmount(int amount){
    	if(amount>=500){
    	    currentBal = currentBal + amount;
    	    return"Amount deposited successfully";
    	}
    		return "Minimum deposit amount must be 500";		
    }
    
    public static String withdrawAmount(int amount){
    	if( amount>(balQuery()-minBal)){
    		return "Insufficient balance";
    	}else{
    		currentBal= balQuery()-amount;
    		return "Amount debited successfully";
    	}
    }
    
    
    public static int balQuery(){
    	return currentBal;
    }
    
    
}
