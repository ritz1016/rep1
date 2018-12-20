package com.niit.collection;

// import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayTreesetDemo1 {

	public static void main(String[] args) {
		TreeSet<String> strings = new TreeSet<>();
		String str1 = "World!!!";
		strings.add("Book");
		strings.add("Pen");
		strings.add(str1);
		strings.add("Pencil");
		strings.add(new String("Hello"));
		strings.add(str1);
		
		// Display all elements using toString()
		System.out.println("Strings : "+strings);
		
		// Using get() - specific to list implementations
//		for(int c= 0; c<strings.size(); c++){
//			System.out.println(c+" . "+strings.get(c));
//		}
		
		//  Accessing elements using iterator
		System.out.println("Elements using iterator");
		Iterator<String> it = strings.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
		//  Enhanced for loop
		System.out.println("Elements using enhanced for loop");
		for( String s1 : strings){
			System.out.println(s1);
		}
		
		//Add an element in a specific position
		//strings.add(3, "Rubber");
		//System.out.println("New String are : "+strings);
		
		// Check to see if the element is existing or not
		if(strings.contains(str1)){
			System.out.println("The element "+str1+" exists");
		}
		else{
			System.out.println("The element "+str1+" does not exist");
		}
		
		// Identify the position of the object
		//System.out.println("The position of the object "+str1+" is "+strings.indexOf(str1));
		
		// Remove the object by object
		strings.remove(str1);
		System.out.println("Now the string after removal by object: "+strings);
		
		// Remove the object by position
//		strings.remove(3);
//		System.out.println("The string after removal by position: "+strings);
//		
		//  
		
	}

}
