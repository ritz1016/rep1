package com.niit.inheritance3;

public class A {
//	public void methodA1(){
//		System.out.println("Call of method 1 of class A.");
//	}
//	public void methodA2(){
//		System.out.println("Call of method 2 of class A.");
//	}
	int x;
	public A(int x){
		this.x = x;
		System.out.println("Inside the super class parameter constructor");
		System.out.println("The parameter is "+x);
		
	}
	public A(){
		System.out.println("Superclass no Parameter constructor");
		this.x = 20;
		System.out.println("Value of x = "+x);
	}

}
