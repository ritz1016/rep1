package com.niit.practice;

import java.util.Scanner;

public class Power {

	static double r=1;
	public static void main(String[] args)
	{
		double n,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Base : ");
		n=sc.nextDouble();
		System.out.println("Enter The Power :");
		p=sc.nextDouble();
		Power.pow(n,p);
		System.out.printf(n+"^"+p+"=%9.9f",r);
		sc.close();
	}

	static void pow(Double n,Double p)
	{

		if(p<=0)
		{
			return;
		}
		else if(n==0 && p>=1)
		{ 
			r=0;
			return;
		}
		else
			r=r*n;

		Power.pow(n,p-1);
	}

}
