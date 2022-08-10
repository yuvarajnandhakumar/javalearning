package org.nonacc1;

public  class CtsFinal extends Cts{

	/*public void method1() {  // same name method cannot be created

	}*/


	private void normalMethod() {
		int z=y+20;
		System.out.println(z);	

		int ff=x+10;
		System.out.println(ff);}


	public static void main(String[] args) {
		CtsFinal c = new CtsFinal();
		c.method2(); //final
		c.method1();
		c.simpleMethod();   //Cts ( y change)

		Cts hh = new Cts();
		hh.method2();
		
		//Cts.method2();  //static
		Cts.method1();  //static
		c.normalMethod();    //CtsFinal ( y - access y=70)

	}


}
