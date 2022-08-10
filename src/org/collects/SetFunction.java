package org.collects;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetFunction {



	private void hashMethod() {
		HashSet oo = new HashSet();
		oo.add("yuvraj");
		oo.add("yuvraj");
		oo.add(45);
		oo.add(45.00f);
		oo.add(54);
		oo.add(54.00);
		oo.add('C');
		System.out.println(oo);

		oo.add(450);
		System.out.println(oo);

	}

	private void linkedhashsetMethod() {
		LinkedHashSet oo = new LinkedHashSet();
		oo.add("yuvraj");
		oo.add("yuvraj");
		oo.add(45);
		oo.add(45.00f);
		oo.add(54);
		oo.add(54.00);
		oo.add('C');
		System.out.println(oo);

		oo.add(451);
		System.out.println(oo);
		
		for (Object obj : oo) {
			System.out.println(obj);
		}

	}


	private void treeMethod() {
		TreeSet<Integer> oo = new TreeSet<Integer>();
		oo.add(455);
		oo.add(74);
		oo.add(45);
		oo.add(12);
		oo.add(54);
		oo.add(789);
		oo.add(32);
		System.out.println(oo);

		oo.add(44);
		System.out.println(oo);

		
		TreeSet<String> o = new TreeSet<String>();
		o.add("tamil");
		o.add("yuva");
		o.add("fayaz");
		o.add("vicky");
		System.out.println(o);
		
		for (String eachvalue : o) {
			System.out.println(eachvalue);
		}

	}
	public static void main(String[] args) {
		SetFunction jj = new SetFunction();
		//jj.hashMethod();
		System.out.println("******************");
		//jj.linkedhashsetMethod();
		System.out.println("******************");
		jj.treeMethod();
	}

}
