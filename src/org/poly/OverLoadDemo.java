package org.poly;

public class OverLoadDemo {
	
	
	public void empdetail2()  
	{
		String z="fayaz";	
		System.out.println(z);
	}
	
	public void argSimple(String y)
	{
		System.out.println(y);
	}
	
	public void add()
	{
		int x=20;
		int y=30;
		int z=x+y;
		System.out.println(z);
	}
	
	public void addition(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		OverLoadDemo d = new OverLoadDemo();
		d.empdetail2();
		d.argSimple("vignesh");
		d.add();
		d.addition(20, 45);
		
	}

}
