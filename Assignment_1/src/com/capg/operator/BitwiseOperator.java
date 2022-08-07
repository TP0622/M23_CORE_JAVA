package com.capg.operator;
//Program for bitwise Operators
public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a=5,b=2;
		int resl= a&b;
		int resl1= a|b;
		int resl2= a^b;
		int resl3= a<<b;
		int resl4= a>>b;
		
		System.out.println("Output for & is : "+resl);
		System.out.println("Output for | is : "+resl1);
		System.out.println("Output for ^ is : "+resl2);
		System.out.println("Output for << is : "+resl3);//Formula = (a * 2^b)
		System.out.println("Output for >> is : "+resl4);//Formula = (a / 2^b)

	}

}
