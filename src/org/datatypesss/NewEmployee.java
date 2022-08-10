package org.datatypesss;

import java.util.Scanner;

public class NewEmployee {

	
	public void scnMethod() 
	{
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("user need to enter int x and y value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.println(z);
		
		System.out.println("user need to enter String value");
		String ss=sc.next();
		System.out.println(ss);*/
		
		/*System.out.println("enter float value");
		float ff=sc.nextFloat();
		
		
		System.out.println("enter byte value");
		byte bb =sc.nextByte();
		
		System.out.println(ff +"  " +bb);*/
		
		/*System.out.println("enter ");
		String spaceignore=sc.next();
		System.out.println(spaceignore);*/
		
		System.out.println("enter a string ");
		String full=sc.nextLine();
		System.out.println(full);
		
		System.out.println("enter a string");
		String aa=sc.nextLine();
		System.out.println(aa);
		//sc.close();
		
		System.out.println("enter a string");
		String ss=sc.nextLine();
		System.out.println(ss);
		
	}
	
	
	
	public static void main(String[] args) {
		NewEmployee ee = new NewEmployee();
		ee.scnMethod();
	}

}
