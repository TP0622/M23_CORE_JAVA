package com.capgemni.oops;
class Pulser
{
	//Class Variables
	public int speed;
	public String color;
	//parameterized counstructor
	/*pulser (int speed,String color)
	{
		this.speed = speed;
		this.color=color;
	}*/
	Pulser(int sp, String col)
	{
		speed=sp;
		color=col;
	}
	void accept()
	{
		System.out.println("Speed is :"+ speed + "and color is "+ color);
	}

}
public class ParameterizedCounstructor {

	public static void main(String[] args) {
		Pulser p=new Pulser(50,"Black");
		p.accept();
	}
		

	}


