package org.abst;

public abstract class AbsClass {  // syntax: public abstract class classname 
	
	public abstract void add();  //  syntax: public abstract void methodname
	
	public static void sub1()  //normal(non abs method) ( declare and define)
	{
		int x=20;
		int y=30;
		int z=x-y;
		System.out.println(z+"sdd of two value");
	}
	
	public abstract void mul();
	public abstract void div();
	public abstract void percentage();
	public abstract void modulo();
	public abstract void sub();

	
	public static void main(String[] args) {
		System.out.println("hi");
		int x=10;
		System.out.println(x);
		//AbsClass ss = new AbsClass();  //obj creation not possible
	}



	
	

}
