package org.stng;

public class Stringpgm {


	public static void main(String[] args) {
		String s="1s5h45iv1a";
		//o/p:1a5v45ih1s

		StringBuffer num= new StringBuffer();
		StringBuffer alpha= new StringBuffer();
		StringBuffer newalpha= new StringBuffer();


		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num.append(s.charAt(i));
			}
			if(Character.isAlphabetic(s.charAt(i)))
			{
				alpha.append(s.charAt(i));
			}

		}

		System.out.println(num);
		System.out.println(alpha);

		StringBuffer rev = alpha.reverse();
		String srev = rev.toString();
		char[] cs = srev.toCharArray(); // 5 values - s ->10
		//shiva - avihs
		int j=0;
		for (int i = 0; i < s.length(); i++)  //1s5h45iv1a
		{
			if(Character.isDigit(s.charAt(i)))
			{
				newalpha.append(s.charAt(i));//1a5v   
			}
			else
			{
				newalpha.append(cs[j]); //cs[5] // i -> 10
				j++;
			}
		}
		System.out.println(newalpha);

		String ss="Hi I am fine";
		String[] split = ss.split(" ");
		for(int i=0;i<split.length;i=i+2)
		{
			StringBuffer sb = new StringBuffer(split[i]);
			StringBuffer rev1 = sb.reverse();
		}
		

		
	}

	

}
