package com.cg.recursion;

//Example for finding sum of digits in a number.

public class SumOfDigits {
	private static int sumofDigits(int num) 
	{
		//If num i9s zero then return
		if (num==0){
			return 0;
		}
		
		//Here we give a recursive call
		return num % 10 + sumofDigits(num/10);//Here /10 reduces the number
	}

	public static void main(String[] args) 
	{
		
		//Now we call sumofDigits(1234)
		int result = sumofDigits(1234);
		
		//now we prinnt the result
		System.out.println(result);
		}
		

	}


