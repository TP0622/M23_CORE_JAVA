package com.cg.Function;

import java.util.Scanner;

public class Factorial 
{
	//Func defination
	static int factorial(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++) 
		{
			fact = (fact * i);
			
		}
		return fact;
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value of n:");
		int n = s.nextInt();
		System.out.println("Factorial of " + n + " is " + factorial(n));//Function call
		s.close();

	}

}
