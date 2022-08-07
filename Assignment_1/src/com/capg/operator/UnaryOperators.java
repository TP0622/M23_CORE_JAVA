package com.capg.operator;
//Program for unary operators(Increment And decrement)
public class UnaryOperators {

	public static void main(String[] args)
	{
		int a = 5, b = 3;
		//For Pre & Post Increment:-
		
		int x=a++;//Post increment- returns x=5 but a becomes 6.
		
		int y=++b;//Pre Increment- returns y=4.
		
		int z=(x+a);//here x=5 and a =6 so 5 + 6 = 11
		
		System.out.println("Output = " + z);
		
		//For Pre & Post Decrement:-
		int a1 = 5, b1 = 3;
		int x1=a1--;//Post Decrement - returns x1=5 but a becomes 4.
		
		int y1=--b1;//Pre Decrement- returns y1=2.
		
		int z1=(x1+a1);//here x1=5 and a1 =4 so 5 + 4 = 9
		
		System.out.println("Output = " + z1);
		

	}

}
