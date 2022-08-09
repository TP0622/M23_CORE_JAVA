package com.cg.superkeyword;
class Android
{
	
	
	Android()
	{
		System.out.println("Lava is Android");
	}
	
	
}
class Lava extends Android
{
	
	Lava()
	{
		//?Android Class constructor
		super();
		System.out.println("Hello Everyone!");
	}
}
public class SuperConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Lava l=new Lava();
		
		
		

	}

}
