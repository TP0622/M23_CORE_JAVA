package com.capg.operator;
/*Program for Logical Operators
 * we can use (&& , ||, !)
 */

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args)
	{
Scanner l=new Scanner(System.in);
		
		System.out.println("Enter value for a :");
		int a =l.nextInt();
		
		System.out.println("Enter value for b :");
		int b =l.nextInt();
		
		boolean resl = (a>b && b<8);
		System.out.println("Output is for && :" + resl);
		
		boolean resl1 = (a>b || b<8);
		System.out.println("Output is for || :" + resl1);
		boolean resl2 = !(a>b);
		System.out.println("Output is for ! :" + resl2);
		l.close();

	}

}
