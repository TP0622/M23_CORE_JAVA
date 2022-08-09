package com.cg.superkeyword;
class Color
{
	protected String name="Orange";
}
class Blue extends Color
{
	public String name="Blue";
    public void display()
    {
		System.out.println(name);
		System.out.println(super.name);
		
    }
}
public class SuperVariable {

	public static void main(String[] args) {
		Blue b=new Blue();
		b.display();

	}

}
