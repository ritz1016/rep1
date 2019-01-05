package com.niit.mr3;

//import java.util.HashMap;
//import java.util.Set;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeProcessor e = new EmployeeProcessor();
		Employee e1 = null;
		Scanner sc = new Scanner(System.in);
		String rep = "";
		do{
			e1 = new Employee();
			System.out.println("Enter New Employee Details - ");
			System.out.print("Enter id : ");
			e1.id = sc.nextInt();
			System.out.print("Enter name : ");
			e1.name = sc.next();
			System.out.print("Enter salary : ");
			e1.salary = sc.nextDouble();
			e.addEmp(e1);
//			System.out.println("employee in main : "+e1);;
//			System.out.println("employees list : ");
//			e.dispAll();
			System.out.print("Do you have any more employees ? ");
			rep=sc.next();
		}while (!rep.equals("n"));

//		HashMap<Integer , Employee> hm = new HashMap<>();
		System.out.println("Enter desired option : ");
		System.out.println("1. Show all");
		System.out.println("2. Show for given id");
		int i = sc.nextInt();

		if(i == 1){
			e.dispAll();
		}
		else{
			if(i == 2){
				System.out.println("Enter the id of the desired employee");
				int num = sc.nextInt();
				e.dispEmp(num);
			}
			else{
				System.out.println("Wrong option");
			}
		}
		sc.close();	
	}			
}
