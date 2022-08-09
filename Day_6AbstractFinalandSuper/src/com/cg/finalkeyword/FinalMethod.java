package com.cg.finalkeyword;
class A
{
	A()
	{
		System.out.println("Constructor");
	}
	//if youmake any method as final you cannot override
	//final public void accept()
	public void accept()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	public void accept()
	{
		System.out.println("parent class");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		B b=new B();
		b.accept();

	}

}
