package org.poly;

public class EmpDetail {
	
	
	public void empsalary(int dayofwork)
	{
	int x=1000*dayofwork;
	System.out.println("salary of the person" +x);
	}
	
	public void empsalary()
	{
		System.out.println("trianers salary: 10000");
	}
	
	public void empDetail()
	{
		System.out.println("emp details : yuvaraj");
		System.out.println("1");
		System.out.println("11");
		System.out.println("12");
		System.out.println("13");
		System.out.println("14");
		System.out.println("16");
		System.out.println("18");
		System.out.println("51");
		System.out.println("51");
		
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);

		
	}
	
	public void empDetail(String y)
	{
		System.out.println("emp details : yuvaraj");
	}
	
	public void empDetail(String name, int i)
	{
		System.out.println("emp details : "+name +"age " +i);
	}
	
	public void empDetail(int i,String name)
	{
		System.out.println("emp details : "+name +"age " +i);
	}
	
	public void empDetail(int i,String name, String gen)
	{
		System.out.println("emp details : "+name +"age " +i +"gender " +gen);
	}
	
	public static void main(String[] args) {
		EmpDetail v = new EmpDetail();
		
		/*v.empDetail("vaishali");
		v.empDetail("yuvaraj",23);*/
		v.empDetail();
		/*v.empDetail(26, "yuvaraj");
		v.empDetail(55, "hhh", "sdghgjds");
		v.empsalary(15);*/

	}

}
