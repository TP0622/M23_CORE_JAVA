package com.capg.looping;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value for n :");
		int n = s.nextInt();
		for (int i =1; i <= n;i++) 
		{
			System.out.print(i+" ");
		}
		s.close();

	}

}
