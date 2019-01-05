package com.niit.stringTokenizer;

import java.util.StringTokenizer;

public class StrTokenDemo1 {
	
	public static void main(String[] args){
		String str1 = new String("A quick brown fox jumps over a lazy dog");
		StringTokenizer strToken = new StringTokenizer(str1, " ");
		int count  = strToken.countTokens();
		System.out.println("The String is : "+str1);
		System.out.println("There are "+count+" tokens in the string");
		int c = 0;
		while(strToken.hasMoreTokens()){
			String s = strToken.nextToken();
			System.out.println(c+" "+s);
			c++;
		}
		String str2 = "name : Ritesh;role : Student;email : ritesh.chatterjee@hotmail.com";
		String []str = str2.split(";");
		Person p1 = new Person();
		int i = 0;
		for(String s : str){
			System.out.println(s);
			String val = s.split(":")[1];
			if(i==0){
				p1.setName(val);
			}
			if(i==1){
				p1.setRole(val);
			}
			if(i==2){
				p1.setEmail(val);
			}
			i++;
		}
		System.out.println(p1);
	}
}
