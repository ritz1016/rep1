package com.niit.inheritance1;

public class TestAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA1();
		a.methodA2();
		B b = new B();
		b.methodB1();
		b.methodB2();
		b.methodA1();
		b.methodA2();

	}

}
