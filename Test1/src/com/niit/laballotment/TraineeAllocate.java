package com.niit.laballotment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TraineeAllocate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = "I am aritesh CHatterjee";
		if(st.contains("am")){
			System.out.println("yes");
			st.replaceAll("am", "new");
		}
		System.out.println(st);
	}

}
