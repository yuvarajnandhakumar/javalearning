package org.loopsss;

public class IfFunction {

	public void ifDemoMethod(int p) 
	{
		//int p=40;
		int passmark=35;

		if(p>(passmark-1))  //40>34(satisfied)
		{
			System.out.println("Student passed ");
		}
		if(p<passmark)       //40< 35(not satisfied)
		{
			System.out.println("Student failed");
		}
		if(p==passmark)      // int x=10;(x assigning 10) int x==10;(check)
		{
			System.out.println(" he got exact pass mark");
		}
		if(p>70)
		{
			System.out.println("student got good score");
		}
		if(p>34 && p>90)  // && And condition( to check both condition)
		{
			System.out.println("student passed with more than 90 mark");
		}

		if(p>70 || p<100)//   ||  or condition
		{
			System.out.println("student passed with more than 70 and less than 100");
		}


	}

	public void methodTwo() {
		int m=34;

		if(m>34)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		if(m==50)
		{
			System.out.println("50 mark");
		}
		else
		{
			System.out.println("failed");
		}
		
		
	}
	public void methodThree()
	{
		int m=35;
		
		if(m>35)
		{
			System.out.println("passed");
		}
		else if(m<35)
		{
			System.out.println("failed");
		}
		else if(m==35 && m>36)
		{
			System.out.println("margin mark");
		}
		else
		{
			System.out.println("just pass");
		}

	}
	
	public void ifString() {

		String s="yuvraj@gmail.com";
		
		if(s.equals("yuvaraj@gmail.com"))
		{
			System.out.println("entered valid email");
		}
		
		if(s.contains("gmail"))
		{
			System.out.println("valid mail id");
		}
		
		if(s.equalsIgnoreCase("yuvraj@GmAiL.CoM"))
		{
			System.out.println("equal ignore");
		}
	}

	public static void main(String[] args) {
		IfFunction iff = new IfFunction();
		//iff.ifDemoMethod(91);
		//iff.methodTwo();
		//iff.methodThree();
		iff.ifString();

	}

}
