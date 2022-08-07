package com.cg.recursion;
//Example on recursion
import java.util.Scanner;

public class FactorialRecursion 
{
	//Func defination
		static int factorial(int n)
		{
			if (n==1)
			{
				return 1;
			}
			else {
				return (n * factorial(n-1));
			}
			
			
		}
		

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Value of n:");
			int n = s.nextInt();
			System.out.println("Factorial of " + n + " is " + factorial(n));//Function call
			s.close();




	}

}
