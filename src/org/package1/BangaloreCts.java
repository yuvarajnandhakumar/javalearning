package org.package1;

import org.package2.CoimbatoreCts;

public class BangaloreCts extends ChennaiCts{  //headoffice

	
	
	public void bangaloreEmployee1()
	{
		System.out.println("bangaloreEmployee1");	
	}

	public void bangaloreEmployee2()
	{
		System.out.println("bangaloreEmployee2");	

	}

	public void bangaloreEmployee3()
	{
		System.out.println("bangaloreEmployee3");	

	}
	
	public static void main(String[] args) {
		BangaloreCts bc = new BangaloreCts();
		bc.bangaloreEmployee1();
		bc.bangaloreEmployee3();
	}

}
