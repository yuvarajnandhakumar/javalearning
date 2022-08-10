package org.multiplepackage;

public class Third extends Second{  // runtime error

	public void three() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		Third g = new Third();
		g.three();
		g.one();
	}
	
	
}
