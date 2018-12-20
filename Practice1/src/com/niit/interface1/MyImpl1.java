package com.niit.interface1;

public class MyImpl1 implements MyIface1{
	public void callMe(){
		System.out.println("Interface Method");
	}
	public int add(int x, int y){
		int res;
		res = x + y;
		return res;
	}
	public void hello(){
		System.out.println("Hello All!!!");
	}

}
