package org.stng;

public class StringTypess {


	private void literalMethod() {  //immutable
		String d ="feb batch";
		String e ="feb batch";

		/*int dd = System.identityHashCode(d);
		System.out.println(dd);*/

		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(e));
	}

	private void nonLiteralMethod() {

		String ss = new String("february batch"); //string builder - new//mutable
		String sn = new String("february batch");

		System.out.println(System.identityHashCode(ss));
		System.out.println(System.identityHashCode(sn));


	}

	private void immutableMethod() {
		String d ="feb batch";
		System.out.println("d value memeory " +  System.identityHashCode(d));
		String e ="feb batch";
		System.out.println("e value memeory " +  System.identityHashCode(e));

		d=d+" of 2021";
		System.out.println(d);
		System.out.println("d value memeory "+  System.identityHashCode(d));


	}

	private void mutableMethod() {
	//	StringBuilder sd = new StringBuilder("yuvaraj");
		StringBuffer sd = new StringBuffer("yuvaraj");

		System.out.println("d value memeory "+  System.identityHashCode(sd));
		
		sd=sd.append(" nandhakumar"); //concat
		System.out.println("d value memeory "+  System.identityHashCode(sd));

		System.out.println(sd); //yuvaraj nandhakumar
		
		StringBuffer re = sd.reverse();  //ramukahdnan jaravuy
		System.out.println(re);
		
		System.out.println(sd);
		
		String subs = sd.substring(0, 2);
		System.out.println(subs);
		
		StringBuffer repl = sd.replace(0, 7, "feb45wda");
		System.out.println(repl);
		
		

	}

	public static void main(String[] args) {
		StringTypess g  = new StringTypess();
		//g.literalMethod();
		//g.nonLiteralMethod();
		//g.immutableMethod();
		g.mutableMethod();

	}

}
