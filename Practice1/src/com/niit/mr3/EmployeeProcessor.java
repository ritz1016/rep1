package com.niit.mr3;

import java.util.HashMap;
import java.util.Set;

public class EmployeeProcessor {
	
	HashMap<Integer , Employee> hm ; 
	public EmployeeProcessor(){
		hm = new HashMap<>();
	}
	
	Employee e1 = new Employee();
	
	public void addEmp(Employee e){
		e1 = e;
//		System.out.println("employee adding : "+e1);
		hm.put(e1.id, e1);
		
	}
	
	public void dispAll(){
//		System.out.println("List of employees : "+hm);
		Set<Integer> keys = hm.keySet();
		for(Integer key : keys){
			System.out.println(hm.get(key));
		}	
	}
	
	public void dispEmp(int i){
		System.out.println(hm.get(i));
		
	}
}
