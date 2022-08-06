package com.cg.inheritance;
import java.util.*;
public class ScannerProgram {

	public static void main(String[] args) 
	{
		System.out.println("Enter a String :");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("The String you entered is :"+ str);
		sc.close();

	}
}
