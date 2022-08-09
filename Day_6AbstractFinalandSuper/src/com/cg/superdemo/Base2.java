package com.cg.superdemo;

public class Base2 extends Base1 
{
	Base2()
	{
		super();//call for parent class default constructor.
		System.out.println("Default constructor for Base1");
	}
	Base2(int i)
	{
		super(i);//call for parent class Parameterized constructor. 
		System.out.println("Parameterized constructor for Base1" + i);
	}


}
