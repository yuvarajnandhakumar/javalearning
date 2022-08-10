package org.cnst;

public class ChildConst extends ParentConst{
int x;

	/*public ChildConst() // 
	{
		int f=50;
		System.out.println("hi");
		super(10);//parameterized-con-int/String  (parent)
		// super(10); - more than one we cannot use as super
		System.out.println("child default constuctor");	
		int a=10;
	}*/
	
	public static void ss(int x)
	{
		
	}
	public static void ss(String x)
	{
		
	}
	public ChildConst()
	{
		this(10);
		System.out.println("child default constuctor");	
	}
	
	public ChildConst(int j)
	{
		this("yuvraj");
		System.out.println("child int " +j);
	}
	
	public ChildConst(String j)
	{
		super(10);
		System.out.println("child String " +j);
	}
	

	public static void main(String[] args) {
		ChildConst cc = new ChildConst();
		//ChildConst cc1 = new ChildConst(10);
		//ChildConst cc2 = new ChildConst("yuvaraj");


	}

}

//parent- int
//child- constructor
//--default **
//child-int
//parent-string
//parent-int and string
//child-string


