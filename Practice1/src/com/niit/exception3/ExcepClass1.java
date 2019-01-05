package com.niit.exception3;

public class ExcepClass1 {
	public void tryExcep() throws MyException1{
		try{
			MyException1 e = new MyException1("Throwing MyException1");
			throw e;
		}
		catch(MyException1 e){
			System.out.println("Caught Exception : "+e);
		}
	}
	
}
