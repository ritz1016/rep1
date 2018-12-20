package com.niit.mr1;

import java.util.Scanner;

public class PrintDesign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0; 
		int j = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for design print: ");
		num = sc.nextInt();
		for(i = 1; i<=num; i++){
			for(j= 1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
