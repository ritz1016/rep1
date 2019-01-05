package com.niit.exception1;

import java.util.Scanner;

public class TryCatchExcepApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TryCatchExcep tc = new TryCatchExcep();
		int a;
		int b;
		System.out.println("Enter two numbers for division");
		a= sc.nextInt();
		b= sc.nextInt();
		tc.divRes(a, b);
		sc.close();

	}

}
