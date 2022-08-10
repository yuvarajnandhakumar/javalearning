package org.package2;

import org.package1.India;
import org.package1.SriLanka;

public class Pakistan extends India{

	public static void main(String[] args) {
		Pakistan p = new Pakistan();
		p.method1();  // extends
		
		India i = new India();  // class level Obj
		//i.method1();

	}

}
