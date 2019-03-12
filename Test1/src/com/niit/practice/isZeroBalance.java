package com.niit.practice;

import java.util.Scanner;

public class isZeroBalance {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a;
		System.out.println("Enter size of the array: ");
		int n = sc.nextInt();
		a= new int[n];
		System.out.println("Enter the values for the array : ");
		for(int i = 0; i< n; i ++){
			a[i]=sc.nextInt();
		}
		if(balanceCheck(a)){
			System.out.println("The array is balanced");
		}
		else{
			System.out.println("The array is  not balanced");
		}
	}
	
	public static boolean balanceCheck(int[] a){
		boolean res = false;
		int sum = 0;
		for(int i = 0; i<a.length; i++){
			sum= sum + a[i];
		}
		if(sum==0){
			res = true;
		}
		else{
			res = false;
		}
		
		return res;
	}
}
