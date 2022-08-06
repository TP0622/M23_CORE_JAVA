package com.cg.inheritance;
//Program for multilevel Inheritance
class Bike
{
	protected int speed;
	void display() 
	{
		System.out.println("I love riding a bike");
	}
	
}
class Pulsar extends Bike
{
	protected String colour;
	void print()
	{
		System.out.println("Speed is :"+speed+"Kmph");
	}
}
class Pulsar125 extends Pulsar
{
	void accept()
	{
		System.out.println("Colour is"+ colour);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Pulsar125 p=new Pulsar125();
		p.colour="Red";
		p.speed=(60);
		p.accept();
		p.display();
		p.print();
	
	}
	

}
