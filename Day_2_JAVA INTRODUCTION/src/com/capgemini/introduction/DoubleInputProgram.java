package com.capgemini.introduction;

import java.util.Scanner;

public class DoubleInputProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		Double x= sc.nextDouble();
		System.out.println(x+" is a "+ x.getClass());

	}

}
