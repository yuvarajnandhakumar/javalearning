package org.rideee;

public class Student extends Exam{


	
	public void simple() {
		// TODO Auto-generated method stub
		super.simple();
	}

	@Override
	public void demo(int x) {
		super.demo(x);
		System.out.println("demo extra");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.simple();
		s.demo(10);
	}
}
