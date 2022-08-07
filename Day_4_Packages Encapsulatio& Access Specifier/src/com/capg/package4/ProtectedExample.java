//Example For Protected Access Specifier
package com.capg.package4;
class Car
{
	protected void Print() 
	{
		System.out.println(" Use of protected Access Specifier ");
		
	}
}
class Mercedes extends Car
{
	//Here Class Mercedes is accesing Properties of Class Car. 
}
public class ProtectedExample {

	public static void main(String[] args) 
	{
		Mercedes m=new Mercedes();
		m.Print();
		

	}

}
