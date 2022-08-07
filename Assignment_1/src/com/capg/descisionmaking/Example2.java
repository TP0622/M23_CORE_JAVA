package com.capg.descisionmaking;
//Program for cascaded if...elseif...else 
public class Example2 {

	public static void main(String[] args) 
	{
		int a = 11, b =6, c =23;
		if (a>b && a>c) 
		{
			System.out.println("a is Greater = " + a);
		}
		else if (b>a && b>c) 
		{
			System.out.println("b is Greater = " + b);
		}
		else {
			System.out.println("c is Greater = " + c);
		}
		

	}

}
