package org.package1;

import org.package2.CoimbatoreCts;

public class ChennaiCts{


	public void chennaiEmployee1()
	{
		System.out.println("chennai Employee1");
	}

	public void chennaiEmployee2() 
	{
		System.out.println("chennai Employee2");
	}

	public void chennaiEmployee3() 
	{
		System.out.println("chennai Employee3");

	}
	
	
	public static void main(String[] args) {
		ChennaiCts tt = new ChennaiCts();  //tt- obj ChennaiCts-classname
		tt.chennaiEmployee1();
		tt.chennaiEmployee2();
		tt.chennaiEmployee3();
		tt.chennaiEmployee1();
		
		/*tt.bangaloreEmployee1();
		tt.bangaloreEmployee2();
		tt.bangaloreEmployee3();*/
		
		
		
		BangaloreCts bb = new BangaloreCts();
		bb.bangaloreEmployee1();
		bb.bangaloreEmployee2(); //ctrl+shiift+/
		
		
		CoimbatoreCts cc = new CoimbatoreCts();
		cc.coimbatoreEmployee1();
		cc.coimbatoreEmployee2();
		
	}

}
