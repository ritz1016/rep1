package com.niit.String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Ritesh";
		String b = new String("Ritesh");
		String c = "RITESH";
		String d = new String("RITESH");
		
		//String object comparison
		if(a==b){
			System.out.println("a and b are same");
		}
		else{
			System.out.println("a and b are not same");
		}
		
		//string content comparison
		if (a.equals(b)){
			System.out.println("content of a and b are same");
		}
		else{
			System.out.println("content of a and b are not same");
		}
		
		//length of the string
		System.out.println("The length of c is "+c.length());
		
		//character at specified index
		System.out.println("The character at 3 is"+d.charAt(3));
		
		//string content comparison irrespective of the case
		if (a.equalsIgnoreCase(d)){
			System.out.println("content of a and d are same");
		}
		else{
			System.out.println("content of a and d are not same");
		}
		
		//comparison of two strings based on characters
		if (b.compareTo(d)){
			System.out.println("Both the strings b and d are same");
		}
		else{
			System.out.println("Both the strings b and d are not same");
		}
		
		//comparison of two strings based on characters
		if (b.compareToIgnoreCase(d)){
			System.out.println("Both the strings b and d are same");
		}
		else{
			System.out.println("Both the strings b and d are not same");
		}
		
		//prefix check
		System.out.println("The string b starts with"+c.startsWith("R"));
		
		//prefix check with offset
		System.out.println("The string b at pos 2 starts with"+c.startsWith("R", 1));
		
		//suffix check
//		System.out.println("The string c ends with"+c.);
		

	}

}
