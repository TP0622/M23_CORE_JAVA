package com.cg.recursion;
//Example on Fibonacci Series
public class FibonacciSeries 
{
	static int n1=0,n2=1,sum=0;
	static void printFibonacci(int x) 
	{
		if (x>0) {
			sum =n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.print(" " + sum);
			printFibonacci(x-1);
		}
	}

	public static void main(String[] args) 
	{
		int x =10;
		System.out.print("Fibonacci Series = "+ n1 + " " + n2);//Here we print 0 & 1.
		printFibonacci(x-2);//Because 2 numbers are already printed.
		
		

	}

}
