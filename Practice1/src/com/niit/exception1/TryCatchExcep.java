package com.niit.exception1;

public class TryCatchExcep {
	int res;
	
	public void divRes(int a, int b){
		try{
			res = a/b;
			System.out.println("The result is : "+res);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception Caught!!!");
		}
		
	}
	
}
