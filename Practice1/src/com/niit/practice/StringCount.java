package com.niit.practice;

import java.util.Scanner;

public class StringCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a a string to get the count : ");
		String str = sc.next();
		str+=sc.next();
		char[] ch = str.toCharArray(); 
	    for (int i = 0; i < ch.length; i++) { 
	       	String s = ""; 
	        while (i < ch.length && ch[i]!=' '){  
	            s = s + ch[i]; 
	            i++; 
	        } 
	        if (s.length() > 0)  
	            System.out.println(s + "->" + s.length());             
	       	} 
	}

}
