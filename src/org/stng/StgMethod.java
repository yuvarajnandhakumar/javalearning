package org.stng;

public class StgMethod {

	private void simple()
	{

		String s="Fb Batch name";  //seq of char
				//01234567890123 -- total - 9
		System.out.println(s.charAt(2));
		char[] cs = s.toCharArray();  
		System.out.println(cs[0]);
		System.out.println(cs[1]);
		
		int len = s.length();  //13
		int x=10;
		System.out.println(len-1);
		System.out.println();
		System.out.println(cs[len-2]);

		
		
		for(int i=0;i<len;i++)  //8<9
		{
			System.out.print(cs[i]);
		}
		System.out.println();

		String us = s.toUpperCase();
		System.out.println(us);
		
		
		String ls = s.toLowerCase();
		System.out.println(ls);	
		int compareTo = s.compareTo("sdfd");

	}
	
	public void strngarray()
	{
		String s="hi all of students of feb batch";
		
		/*String[] ss = s.split("of");
		int ll = ss.length;
		
		for (String ssnew : ss) {
			System.out.println(ssnew);
		}
		
		for(int i=0;i<ll;i++)
		{
			System.out.println(ss[i]);
		}
		System.out.println(ss[1]);*/
		
		/*boolean con0 = s.contains("stnd");
		System.out.println(con0);
		
		boolean con = s.contains("feb");
		System.out.println(con);*/
		
		String ss="February    month    ";
		boolean ee = ss.equals("february");
		System.out.println(ee);
		System.out.println(ss);
		boolean ei = ss.equalsIgnoreCase("febRuaRy");
		System.out.println(ei);
		
		String newss = ss.trim();
		System.out.println(newss);
		
		
		String addss = ss.concat("of 2021");
		System.out.println(addss);
		
		System.out.println(ss +" of 2021");
		
		String replace = ss.replace('F', 'j');
		System.out.println(replace);
		
	
		
		
	}
	
	
	public static void main(String[] args) {
		StgMethod s = new StgMethod();
		//s.simple();
		s.strngarray();
	}

}
