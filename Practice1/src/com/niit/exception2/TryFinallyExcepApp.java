package com.niit.exception2;

import java.util.Scanner;

public class TryFinallyExcepApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TryFinallyExcep tf = new TryFinallyExcep();
		int mainBal;
		int billAmount;
		System.out.println("Enter available balance : ");
		mainBal = sc.nextInt();
		System.out.println("Enter the bill amount : ");
		billAmount = sc.nextInt();
		int balleft;
		try{
			balleft = tf.balCheck(mainBal, billAmount);
			System.out.println("Your Balance After Transaction is : "+balleft);
			
		}
		catch(MyException1 e){
			System.out.println("Error!!! "+e);
		}
		finally{
			System.out.println("THANK YOU FOR USING THE APP.");
		}
		sc.close();
	}

}
