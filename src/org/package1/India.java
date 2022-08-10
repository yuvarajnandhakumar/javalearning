package org.package1;

public class India {

	/*public void method1()
	{
		System.out.println("public global access");
	}*/

	protected void method1()
	{
		System.out.println("protected - protected level( outside package- Class level object creation) access");
	}

	/* void method1()
	{
		System.out.println("default - outside package not allowed");
	}*/

	private void method11()
	{
		System.out.println("private - only class level access");
	}
	
	public void simmple()
	{
		
	}



	public static void main(String[] args) {
		India i = new India();
		i.method1();
	}

}
