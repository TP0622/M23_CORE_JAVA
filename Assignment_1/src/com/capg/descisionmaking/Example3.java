package com.capg.descisionmaking;
//Program for nested if else
public class Example3 {

	public static void main(String[] args) {
		int age = 15, weight = 55;
		
		if (age>=12) {
			if (weight >= 40) {
				if (weight <= 110) {
					System.out.println("Elligible for bungee jumping!");
				}
				else {
					System.out.println("Extra ropes will be added");
				}
			}
			else {
				System.out.println("Not elligible for bungee jumping");
			}
		}
		else {
			System.out.println("Not Elligible For bungee jumping");
		}

	}

}
