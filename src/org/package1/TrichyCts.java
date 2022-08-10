package org.package1;

import org.package2.CoimbatoreCts;

public class TrichyCts extends CoimbatoreCts{

	public void trichyEmployee(){
		System.out.println("trichy employee");
	}
	public static void main(String[] args) {
		TrichyCts tc = new TrichyCts();
		tc.trichyEmployee();
		tc.chennaiEmployee1();
		tc.bangaloreEmployee1();
		tc.coimbatoreEmployee1();
			
	}

}
