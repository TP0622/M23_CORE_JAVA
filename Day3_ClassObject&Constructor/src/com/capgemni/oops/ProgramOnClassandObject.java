package com.capgemni.oops;
//demo how to use the class and object
class Car
{
	int a;  //variable
	void display() //method
	{
		System.out.println("Your car No. is: ");
	}
}
public class ProgramOnClassandObject {

	public static void main(String[] args) {
		//object creation
		Car obj=new Car();
		//accessing the Car class method
		obj.display();
		obj.a=55;
		//accessing the Car class Variable
		System.out.println(obj.a);

	}

}
