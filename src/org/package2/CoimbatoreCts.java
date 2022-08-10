package org.package2;

import org.package1.BangaloreCts;
import org.package1.ChennaiCts;

public class CoimbatoreCts extends BangaloreCts{

	public void coimbatoreEmployee1()
	{
		System.out.println("coimbatoreEmployee1");	
	}

	public void coimbatoreEmployee2() 
	{
		System.out.println("coimbatoreEmployee2");	

	}

	public void coimbatoreEmployee3()
	{
		System.out.println("coimbatoreEmployee3");	

	}
	
	public static void main(String[] args) {
		CoimbatoreCts cc = new CoimbatoreCts();
		cc.coimbatoreEmployee1();
		cc.coimbatoreEmployee2();
		
		ChennaiCts ct = new ChennaiCts();
		ct.chennaiEmployee1();
		
		BangaloreCts bc = new BangaloreCts();
		bc.bangaloreEmployee1();
	}

}
