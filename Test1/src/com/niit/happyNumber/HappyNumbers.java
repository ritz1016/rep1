package com.niit.happyNumber;

import java.util.Scanner;

public class HappyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit number : ");
		int num = sc.nextInt();
		System.out.println("All The Happy Numbers till "+num+" are : ");
		for(int i = 1; i<=num ; i++){
			if(happyCheck(i)){
				System.out.println(i);
				continue;
			}
//		happyCheck(num);
		}
	}
	
	public static int sqresum(int num){
		int sum=0;
		int temp;
		if(num>=0 && num<=9){
			sum = sum + (num * num);
			System.out.println(sum);
		}
		else{
			if(num>9){
				do{
					temp = num%10;
					num = num/10;
					sum = sum + (temp*temp);
					System.out.println(sum);
				}while(num<9);
			}
		}
		return sum;
	}
	
	public static boolean happyCheck(int num){
		boolean res = false;
		int temp = sqresum(num);
		if(temp==1){
			res = true;
		}
		return res;
	}

}
