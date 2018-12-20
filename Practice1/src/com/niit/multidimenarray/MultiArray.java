package com.niit.multidimenarray;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first dimension of the array: ");
		int m = sc.nextInt();
		int [][]a = new int [m][];
		for (int i= 0 ; i<m; i++){
			System.out.println("Enter the second dimension ");
			int n = sc.nextInt();
			a[i] = new int [n];
		}
		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i< m; i++){
			for (int j=0; j<a[i].length; j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The values in the array are : ");
		for(int i = 0; i<m; i++){
			for (int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}