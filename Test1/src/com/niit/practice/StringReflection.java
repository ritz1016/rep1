package com.niit.practice;

import java.util.Scanner;

public class StringReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter your desired string : ");
		String s = sc.next();
		String r = reflector(s);
		System.out.println("The alphabetical reflection of "+s+" is : \n"+r);
	}
	
	public static String reflector(String s){
		
		char ch;
		String res="";
		for(int i = 0; i < s.length(); i++){
			ch=s.charAt(i);
//			System.out.println(s.length());
			if(Character.isLetter(ch)){
				
				if(Character.isLowerCase(ch)){
					 ch = (char)(122 - (int)(ch) + 97);
				}
				else{
					if(Character.isUpperCase(ch)){
						ch = (char)(90 - (int)(ch) + 65);
					}
				}
			}
			res = res + Character.toString(ch);
		}
		return res;
	}

}
