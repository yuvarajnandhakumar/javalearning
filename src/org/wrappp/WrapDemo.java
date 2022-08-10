package org.wrappp;

public class WrapDemo {


	void method()
	{
		Integer x = new Integer(10);
		
		String sv = String.valueOf(x);
		String st = String.valueOf(x);
		System.out.println(st);
		
		
		short s = x.shortValue();   // return type=( ctrl+ 2) and press L
		double d = x.doubleValue();
		System.out.println("double "+d);
		
		float f = x.floatValue();
		System.out.println("float " +d);
		
		byte b=127;
		byte b1=120;
		int b2=b+b1;
		
		short ss=10;
		int sss=ss+s;
		System.out.println(sss);
		
		
		
		//String-String byte-Byte
		System.out.println("string to int");
		String st1="150";
		int intst1 = Integer.parseInt(st1);
		System.out.println(intst1);
		
		Integer dd = new Integer(intst1);
		double ddv = dd.doubleValue();
		System.out.println(ddv);
		
		
		
	}


	public static void main(String[] args) {

		WrapDemo wd = new WrapDemo();
		wd.method();








	}


}
