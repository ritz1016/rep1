package com.niit.mr1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number For Multiplication Table");
		int num = sc.nextInt();
		for (i = 1; i<=10; i++){
			System.out.println(num+"*"+i+"="+num*i);
		}
		sc.close();

	}

}
