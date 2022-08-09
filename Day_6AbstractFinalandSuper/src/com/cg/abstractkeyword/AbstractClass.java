//Example for Abstract class
package com.cg.abstractkeyword;
abstract class flower
{
	//abstract method
	abstract void print();
	//non-abstract method
	void accept()
	{
		System.out.println("Demo on abstract keyword");
	}
}
class lilly extends flower
{
	void print()
	{
		System.out.println("Hey,Folks i like the fragrance of lilly");
	}
}
public class AbstractClass {

	public static void main(String[] args) 
	{
		//flower l=new flower();
		lilly l=new lilly();
		l.print();
		l.accept();
		

	}

}
