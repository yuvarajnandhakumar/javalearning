package org.loopsss;

import java.util.Scanner;

public class LoopFunctions {

	public void postPreMethod() {

		/*int i=10;
		//i++;  // post increment operator
		System.out.println(++i);
		//System.out.println();
		//System.out.println(i);
		//--i; // pre decrement operator
		System.out.println(--i);
		 */

		int a=10;
		System.out.println(a++);

		int b=30;
		System.out.println(b--);


		System.out.println(a);
		System.out.println(b);

		System.out.println(--a);
		System.out.println(--b);





	}

	public void whileMethod()
	{
		int i=5; //assigning a value
		while(i<1)  //condition 5<1
		{
			System.out.println(i); //logic
			i++;  // increment
		}
	}

	public void doWhileMethod()
	{
		int i=5;  //assign
		do
		{
			System.out.println(i); //logics
			i++;
			if(i==7)
				break;//increment
		}
		while(i<10); //condition check point
	}


	public void forLoop()
	{
		//  assign; condition; operation
		for (int i = 5; i > 10; i++) // first loop ( i=5 ; 5<10) 6 (6<10;7) (7<10 8)(8<10 9)
		{
			System.out.println(i);
		}

		for(int i=0;i<1;i--)
		{
			System.out.println(i);
		}
	}

	public void switchMethod()
	{
		int day=3;
		String days="SUN";

		Scanner s = new Scanner(System.in);
		System.out.println("enter a weekdays");
		String ss = s.nextLine();
		switch(ss)
		{
		case "MON":
			System.out.println("today monday");
			System.out.println("momnday is all working day");
			break;

		case "SUN":
			System.out.println("today sunday");
			System.out.println("leave - holiday");
			break;

		case "FRI":
			System.out.println("today weekend");
			System.out.println("half day - half holiday");
			break;
		default:System.out.println("enter MON SUN FRI as i/p");


		}


	}

	public void continueSystemExit()
	{
		int i=5;
		for (int j = 0; j <10 ; j++) 
		{
			if( j==i) //0==5 1==5 2==5 3==5 4==5 5==5
			{	
				System.out.println(j +" " +i);
				//break;  //overall iteration will break
				continue; //current iteration break
				//System.exit(0); // terminate ur jvm
			}
			System.out.println(j);
			// line 10
		}
		System.out.println("break/continue has been done when j==i");
	}
	
	
	public void doubleforloop()
	{
		for (int i = 0; i < 3; i++)//0<3     // 1<3   //2<3
		{
			for (int j = 0; j < 4; j++) //0<4  1<4  2<4  3<4 
			{
			System.out.println(i+j +" value of " +i +" " +j);
			}
		}
	}


	public static void main(String[] args) {
		LoopFunctions lp = new LoopFunctions();
		//lp.whileMethod();
		//lp.doWhileMethod();
		//lp.forLoop();

		//lp.switchMethod();
		//lp.continueSystemExit();
		//lp.switchMethod();
		lp.doubleforloop();
	}

}
