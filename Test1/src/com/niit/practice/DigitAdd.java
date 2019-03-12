package com.niit.practice;

import java.util.Scanner;

public class DigitAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number = sc.nextInt();
		int quotient, remainder;
		int count=0;
		while(number>=10){
			if(number/10!=0){
				quotient = number/10;
				remainder = number%10;				
				number=quotient+remainder;
			}
			count++;
		}
		System.out.println("Count of adding : "+count);
	}

}
