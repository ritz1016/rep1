package com.niit.io;

import java.io.File;

import org.apache.log4j.Logger;

public class FileDemo1 {
	
	public static Logger log = Logger.getLogger(FileDemo1.class);
	
	public static void main(String [] args){
		File file = new File("C:\\Users\\Ritesh\\Videos\\movies");
		File[] list = file.listFiles();
		for(File f : list){
			if(f.isDirectory()){
			System.out.println(f.getName());
			}
			else{
				System.out.println("is a directory.");
			}
		}
	}
}
