package com.niit.dateprac2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DatePrac2 {

	public static void main(String[] args) {
		Date d = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(GregorianCalendar.DATE, 26);
		gc.set(GregorianCalendar.MONTH, 00);
		gc.set(GregorianCalendar.YEAR, 2010);
		d = gc.getTime();
		System.out.println("The date is : "+d);
		DateFormat df =DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Generic Date Format "+df.format(d));
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Custom Date Format "+sdf.format(d));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in the format(dd-MM-yyyy)");
		String date = sc.next();
//		String date = "26-09-1998";
		try{
			Date d3 = sdf.parse(date);
			System.out.println("The date given by user: "+d3);
//			System.out.println("The date from  date object: "+sdf.format(d3));
		}
		catch(ParseException e){
			System.out.println("Exception "+e);
		}
	}

}
