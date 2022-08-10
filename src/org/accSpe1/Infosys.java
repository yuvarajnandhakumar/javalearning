package org.accSpe1;

public class Infosys  extends CtsClass{
	
	public void returnTypeMethod11() 
	{
		int d=returnTypeMethod()-20;
		System.out.println(d);	
	}
	
	public static void main(String[] args) {
		Infosys ii = new Infosys();
		ii.returnTypeMethod11();
	}

}
