package org.accSpe1;

public class CtsClass {

	public void nullMethod()
	{
		System.out.println("z=30");
	}
	
	public int returnTypeMethod()
	{
		int transfer=10;
		int acc=200;
		int current=acc-transfer;
		return current;	
	}
	
	
	
	public int returnTypeMethod1()
	{
		int d=returnTypeMethod()-100;
		System.out.println(d);
		return d;	
	}
	
	
	public static void main(String[] args) {

		CtsClass cc = new CtsClass();
		cc.nullMethod();
		System.out.println(cc.returnTypeMethod());
		System.out.println(cc.returnTypeMethod1());
	}

}
