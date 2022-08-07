package com.capg.operator;
/*Program for Assignment Operator
 * Here we can use operators like (=, +=,-=,*=,/=,%=)
 */

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args)
	{
Scanner f=new Scanner(System.in);
		
		System.out.println("Enter Value for a :");
		int a= f.nextInt();
		
		System.out.println("Enter value for b :");
		int b =f.nextInt();
		
		a*=b;//Here a = a * b.
		
		System.out.println("Value of a becomes :" + a);
		f.close();

	}

}
