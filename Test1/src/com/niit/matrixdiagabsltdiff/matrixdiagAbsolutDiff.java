package com.niit.matrixdiagabsltdiff;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class matrixdiagAbsolutDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int size = sc2.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("Enter the values in the matrix : ");
		for(int i = 0; i<size; i++){
			for(int j = 0; j< size; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<size; i++){
			for(int j = 0; j< size; j++){
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
