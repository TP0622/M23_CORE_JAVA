package com.capg.package4;
//Program on Encapsulation
import com.capg.package3.HDFC;//Importing HDFC class from Package3

public class EncapsulationHDFC {

	public static void main(String[] args) {
		HDFC h=new HDFC();//Creating object h.
		
		h.setAmount(56000);//Calling Setters
		
		System.out.println("Your Acount Balance is :" + h.getAmount());//Calling Getters

	}

}
