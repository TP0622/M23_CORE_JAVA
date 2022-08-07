package com.capg.descisionmaking;

import java.util.Scanner;

//Example for Switch case.
public class Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Input your choice : ");
		int a = s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Shrivalli");
			break;
		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("Tushar");
			break;
		default:
			System.out.println("Invalid input");
			s.close();
		}
		
		

	}

}
