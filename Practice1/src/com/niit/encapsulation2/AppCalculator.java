package com.niit.encapsulation2;

import java.util.Scanner;

public class AppCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator	c1 = new Calculator();
		System.out.println("Enter Two Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 == num2)
		{
			c1.read(num1);		
		}
		else
		{
			c1.read(num1, num2);
		}
		int sum = c1.add();
		System.out.println("Sum: "+sum);
		int sub = c1.sub();
		System.out.println("Substract: "+sub);
		int mul = c1.mul();
		System.out.println("Multiply: "+mul);
		int div = c1.div();
		System.out.println("Divide: "+div);
		System.out.println("THANK YOU!!!");
		sc.close();

	}

}
