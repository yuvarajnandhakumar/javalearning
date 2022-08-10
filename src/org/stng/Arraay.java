package org.stng;

import java.util.Arrays;
import java.util.Scanner;

public class Arraay {


	private void simpleArray() {

		int x0=10;  // memory
		int x1=20;
		int x3=30;

		int x[]={10,20,30};  // length / size =3 (index-0,1,2)
		System.out.println(x[0]);
		System.out.println(x[1]);
		int xl = x.length;

		Arrays.sort(x);   


		int []y={10,20};
		int yl = y.length;

		int z[];
		z=new int[5]; // 0 1 2 3 4
		//or
		int ze[]=new int[100];

		for(int i=0;i<100;i++)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter a int value");
			int nn = s.nextInt();
			ze[i]=nn;
		}


		z[0]=50; 
		z[1]=10;
		z[3]=12;
		z[4]=13;   // z[5]
		//z[5]=45;

		System.out.println(z);
		for (int i = 0; i < z.length; i++)   //z[5]
		{
			System.out.println(z[i]);

		}
		//second largest - second smallest
		//two array - smallest value
		
		for (int i = ((z.length)-1); i >=0; i--) 
		{
			System.out.println(z[i]);
		}


		/*String s[]={"yuva","vignesh","fayas","10"};
		char c[]={'a','f'};*/
	}


	private void twoDArray() {

		int ze[][]=new int[5][2];
		int lze = ze.length;

		Scanner s = new Scanner (System.in);




		ze[0][0]=10; // 1 -1
		ze[0][1]=50; // 1-2

		ze[1][0]=45;
		ze[1][1]=12;

		ze[2][0]=452;
		ze[2][1]=112;

		ze[3][0]=425;
		ze[3][1]=27;

		ze[4][0]=345;
		ze[4][1]=192;

		//System.out.println(lze);

		for (int i = 0; i < 5; i++)  //1
		{
			for(int j=0;j<=1;j++) //0
			{		
				System.out.println("enter a int");
				int f= s.nextInt();
				ze[i][j]=f;	
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++)  //1
		{
			for(int j=0;j<=1;j++) //0
			{
				System.out.print(ze[i][j] +"\t");   //0 -0/1    //1 -0/1  //2 0/1
			}
			System.out.println();
		}

	}

	private void compa() {

		int x[]={1,2,10,10,22,33};  //3
		int y[]={44,2,10,20,30,40,50,5};   //5

		int l1 = x.length;  //6
		int l2 = y.length; //8

		Arrays.sort(y);



		for(int i=0;i<l2;i++)   //0 1 2 3 4 5
		{
			System.out.println(y[i]); //30   40
			//System.out.println(x[i]);  //33  out
		} 



		/*if(l1<l2)  // l1
		{
			for (int i = 0; i < l1; i++)   
			{
				if(x[i]==y[i])
				{
					System.out.println(x[i]);
				}
			}
		}


		if(l1>l2) 
		{
			for (int i = 0; i < l2; i++)   
			{
				System.out.println(y[i]);

			}	
		}*/




	}


	public void sss()
	{
		int y[]={44,2,10,23,3,30,4,15,50,5}; 
		int l = y.length; 
		Arrays.sort(y);
		for(int i=0;i<l;i++)
		{
			System.out.print(y[i] +" ");
		} 
		System.out.println(y[1]);
	}
	public static void main(String[] args) {
		Arraay a = new Arraay();
		//	a.simpleArray();
		//a.twoDArray();
		//a.compa();
		a.sss();
	}

}
