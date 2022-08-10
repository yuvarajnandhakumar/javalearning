package org.nonacc1;

public class Cts {
	
	int x=10;  // class level - local variable
	static int y=20; //static level - static variable(datatype)
	final int z=40; //final level - datatype
	
	
	public void simpleMethod()
	{
		y=y+50; // y value can be changes and re used
		System.out.println(y);
		
		x=z+50;
		System.out.println(x);
		
		//z=z-10; // z value cannot be changed -reuse not allowed
		System.out.println(z);
		//static int d=15;  // not possible inside a method
		 int fs=40; //- reuse not possible
		
	}
	
	public static void method1()
	{
		
	}
	
	public  final  void method2()
	{
		
	}

	
	public static void main(String[] args) {
		Cts hh = new Cts();
		hh.method2();
	}
}
