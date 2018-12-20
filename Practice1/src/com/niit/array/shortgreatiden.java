package com.niit.array;

import java.util.Scanner;

public class shortgreatiden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks[];
		int greatest = 0;
		int smallest;
		System.out.println("ENTER THE SIZE OF THE ARRAY: ");
		int n = sc.nextInt();
		marks = new int[n];
		System.out.println("ENTER VALUES IN THE ARRAY: ");
		for (int c= 0; c<n ; c++)
		{
			marks[c] = sc.nextInt();
		}
		greatest = marks[0];
		smallest = marks[0];
		for (int c = 1; c<n; c++)
		{
			if (marks[c]>greatest)
			{
				greatest = marks[c];
			}
			if (marks[c]<greatest)
			{
				smallest = marks[c];
			}
			
		}
		System.out.println("The greatest number in the array is: "+greatest);
		System.out.println("The smallest number in the array is: "+smallest);
		sc.close();
	}

}
