package com.niit.magicalnumber;

import java.util.Scanner;

public class magicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for employees : ");
		int empnum = sc.nextInt();
		System.out.println("Enter the number given by manager : ");
		int mgrnum = sc.nextInt();
		int q = 0, temp = 0, result = 0;
		if(empnum % mgrnum == 0){
			System.out.println("0");
		}
		else{
			q= empnum/mgrnum;
			temp = q * mgrnum + mgrnum;
			result = temp - empnum;
			System.out.println(result);
		}
		
	}

}
