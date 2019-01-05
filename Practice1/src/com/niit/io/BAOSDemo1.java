package com.niit.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class BAOSDemo1 {
	public static Logger log = Logger.getLogger(BAOSDemo1.class);
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		ObjectOutputStream oos = new ObjectOutputStream(baos);
		ByteArrayInputStream bais =null;
		String name = "Ritesh Chatterjee";
		try{
			baos.write(name.getBytes());
			byte [] arr = baos.toByteArray();
			bais = new ByteArrayInputStream(arr);
			int b;
			do{
				b = bais.read();
				if(b!=-1){
					System.out.println((char)b);
				}
			}while(b!=-1);
		}
		catch(IOException e){
			log.error(e);
		}
		finally{
			try {
				baos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bais.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("BAOS : "+baos);

	}

}
