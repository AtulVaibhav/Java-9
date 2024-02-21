package com.looseCoupling;

public class Test {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		Bank bank = new Bank(sbi);
		System.out.println(bank.getBankName());
	}

}
