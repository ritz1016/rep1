package com.niit.practice;

import java.util.Scanner;

public class ArrayIncreaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		System.out.println("Enter the elements in the array : ");
		int []num = new int[size];
		for(int i = 0; i<size; i++){
			num[i] = sc.nextInt();
		}
		System.out.println("NUmber of elements to be removed : "+increase(num));
	}
	
	public static int increase(int []num){
		int c=0;
		for(int i = 1; i<num.length; i++){
			
			if(num[i-1]>num[i]){
				c++;
			}
			
		}
		return c;
	}
	
}
