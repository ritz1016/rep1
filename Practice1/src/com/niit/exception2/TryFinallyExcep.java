package com.niit.exception2;

public class TryFinallyExcep {
	int res;
	public int balCheck(int m, int b) throws MyException1{
//		try{
			if(b>m){
				MyException1 e = new MyException1("Bill Amount Cannot Be MORE Than Your Account Balance ");
				throw e;
				
			}
			System.out.println();
			res = m - b;
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		finally{
//			System.out.println("Thank You for using the App");
//		}
		return res;
		
	}
	
}
