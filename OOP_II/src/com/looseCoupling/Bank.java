package com.looseCoupling;

public class Bank {
   private RBI bank;
   Bank(RBI bank){
	   this.bank = bank;
   }
   public String getBankName(){
	   return this.bank.getBankName();
   }
	
}
