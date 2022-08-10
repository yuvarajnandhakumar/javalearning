package org.cnst;

public class ParentConst {

	public ParentConst() //default constructor // non parameterized // non argument based constructor
	{
		System.out.println("parent default");
	}

	public ParentConst(int a) //parameterized or argument based constructor
	{
		this("feb");
		System.out.println("parameterized int "+a);
	}

	public ParentConst(String s)//overload possible
	{
		this(10,20);
		System.out.println("parameterized String vhgjhsgdf"+s);

	}

	public ParentConst(int a, int b)
	{
		this(10,"march");
		System.out.println("parameterized int and int  "+a +"  "+b);

	}

	public ParentConst(int a, String d)
	{
		this();
		System.out.println("parameterized int and string"+a +"  "+d);

	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		//ParentConst pc = new ParentConst();  //creating object ( state and behaviour)
	//	ParentConst pc1=new ParentConst(10); //int based constructor
		//ParentConst pc2 = new ParentConst("yuvraj");
		ParentConst.class.newInstance();
		new ParentConst();
		ParentConst.class.getConstructor();	}

}
