package org.collects;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ListFunction {


	private void arrayListMethod() {
		//to allow dissimilar data type
		ArrayList o = new ArrayList(); //length - runtime - add//remove  //index
		o.add("yuavarj"); //string
		o.add('D');//char
		o.add(451);//int
		o.add('D');
		o.add(451.1224f);//float
		System.out.println(o);

		o.remove(1);
		System.out.println(o);

		int ss = o.size();
		System.out.println(ss);

		//similar set datatype
		ArrayList<Integer> oo = new ArrayList<Integer>();
		oo.add(4545);
		oo.add(4543444);
		oo.add(77);
		System.out.println(oo);

	}

	private void linkedListMethod() {
		LinkedList l= new LinkedList();  //defining
		l.add("yuavarj"); //string
		l.add('D');//char
		l.add(451);//int
		l.add(451);
		l.add(451.1224f);//float
		System.out.println(l);

		int ss = l.size();
		System.out.println(ss);

		l.remove(1); //index
		System.out.println(l);
		
		l.remove('D'); //value

		l.add(56);
		l.add(56);

		l.add(56);
		l.add(1, 100);

		System.out.println(l);
		l.add(1, "fayaz");
		System.out.println(l);

		boolean cc = l.contains(1100);
		System.out.println(cc);


		//similar set datatype
		LinkedList<Integer> oo = new LinkedList<Integer>();
		oo.add(4545);
		oo.add(45);
		oo.add(4543444);
		oo.add(77);
		System.out.println(oo);
		
		for (Integer integer : oo) {
			System.out.print(oo);
		}
	}

	public static void main(String[] args) {
		ListFunction l = new ListFunction();
		//l.arrayListMethod();
		l.linkedListMethod();
	}

}
