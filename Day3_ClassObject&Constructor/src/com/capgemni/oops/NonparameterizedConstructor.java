package com.capgemni.oops;
class Animal
{
	int x;
	//(Default)non-Parameterized constructor
	Animal()
	{
		x=10;
		
	}
	void display()
	{
		System.out.println("Lion" + x);
	}
}
public class NonparameterizedConstructor {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.display();
		

	}

}
