package com.capg.packages2;
import com.capg.package1.Package;//importing package in other package
public class DemoimportPackage 
{
	public static void main(String [] args)
	{
		Package p=new Package();
		p.display(62, "Tushar");
	}

}
