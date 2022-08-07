package com.capg.operator;
//Program for Arithmetic operators
// Here we can use operators like(+, -, *, /, %,++,--)etc

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter Value for a :");
		int a= x.nextInt();
		
		System.out.println("Enter value for b :");
		int b =x.nextInt();
		
		int result = (a + b);
		System.out.println("Output = " + result);
		x.close();

	}

}
