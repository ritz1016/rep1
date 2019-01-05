package com.niit.exception3;

public class ExcepClass2 extends ExcepClass1{
	public void tryExcep() throws MyException2{
		try{
			MyException2 e = new MyException2("Throwing MyException2");
			throw e;
		}
		catch(MyException2 e){
			System.out.println("Caught Exception : "+e);
		}
	}
}
