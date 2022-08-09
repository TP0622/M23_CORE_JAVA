package com.cg.finalkeyword;
class car
{
	String name;
	//Final method can be inherited but cannot be overridden.
	final void print(String name)
	{
		System.out.println("My name is :" + name);
	}
}
class Audi extends car
{
	
	
}
public class FinalInheritedMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");
		

	}

}
