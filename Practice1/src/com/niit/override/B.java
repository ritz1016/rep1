package com.niit.override;

public class B extends A{
	public void method2(){
		System.out.println("Inside method 2 of subclass");
	}
	public void method1(){
		System.out.println("Inside method 1 of subclass");
		super.method1();
	}

}
