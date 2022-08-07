package com.capg.operator;
//Program for relational operators
/*(>, <, >=,<=,==,!=, ==)
 * etc we can use in this program
 */ 

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter value for a :");
		int a =s.nextInt();
		
		System.out.println("Enter value for b :");
		int b =s.nextInt();
		
		boolean resl =(a >= b);
		System.out.println("Output :" + resl );
		s.close();
		
	}

}
