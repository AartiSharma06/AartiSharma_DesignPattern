package com.aarti.structural.adapter;

public class AdapterManu {

	public static void main(String[] args) {
		 CreditCard targetInterface=new Customer();  
		 targetInterface.giveBankDetails();  
		 System.out.print(targetInterface.getCreditCard());  
	}

}
