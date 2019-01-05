package com.niit.stringTokenizer;

import java.util.Scanner;

public class CommaSeparated {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String(Comma Separated):- ");
		String str2 = sc.nextLine();
		String []str = str2.split(",");
		Person p1 = new Person();
		int i = 0;
		for(String s : str){
			if(i==0){
				p1.setName(str[i]);
			}
			if(i==1){
				p1.setRole(str[i]);
			}
			if(i==2){
				p1.setEmail(str[i]);
			}
			i++;
		}
		System.out.println(p1);
	}

}
