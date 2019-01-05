package com.niit.exception3;

public class ExcepClassApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcepClass1 ec1 = new ExcepClass1();
		ExcepClass2 ec2 = new ExcepClass2();
//		System.out.println(ec1.tryExcep());
//		System.out.println(ec2.tryExcep());
		try{
			ec1.tryExcep();
		}
		catch(MyException1 e){
			System.out.println(e);
		}
		try{
			ec2.tryExcep();
		}
		catch(MyException2 e){
			System.out.println(e);
		}
	}

}
