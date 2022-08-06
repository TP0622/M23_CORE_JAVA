package com.cg.inheritance;
class AndroidVersion
{
	void display1()
	{
		System.out.println("Android Version");
	}
}
class KitKat extends AndroidVersion
{
	void Print()
	{
		System.out.println("Kitkat");
	}
}
class Pie extends AndroidVersion
{
	void Print1()
	{
		System.out.println("Pie");
	}
}
public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		KitKat k=new KitKat();
		Pie p=new Pie();
		k.display1();
		k.Print();
		p.Print1();
	}

}
