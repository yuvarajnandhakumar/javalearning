package org.poly;

public class NewCompany extends EmpDetail{

	@Override
	public void empsalary() {
		super.empsalary();  //parent class
	}

	@Override
	public void empsalary(int x) {
		super.empsalary(x);
	}

	public static void main(String[] args) {
		NewCompany nc = new NewCompany();
		nc.empsalary(25);
		nc.empsalary();
	}

}
