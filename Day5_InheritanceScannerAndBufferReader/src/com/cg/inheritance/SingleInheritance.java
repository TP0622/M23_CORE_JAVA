package com.cg.inheritance;
//Program for inheritance
class Parent
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey Whats going on");
	}
}
class Child extends Parent
{
	protected int rollno;
	void accept()
	{
		System.out.println("rollno is :" + rollno);
		
	}	       
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.rollno=121;
		c.accept();
		c.print();
		

	}

}
