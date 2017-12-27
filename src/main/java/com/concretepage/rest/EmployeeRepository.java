package com.concretepage.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

public class EmployeeRepository {
	private static ArrayList<Employee>  map = new ArrayList<Employee>(); 
	public EmployeeRepository(){
		map.add(new Employee(111, "Ram", "ABC"));
		map.add(new Employee(222, "Shyam", "EFG"));
		map.add(new Employee(333, "Mohan", "XYZ"));
	}
	public  Employee getEmployeeById(String id){
		return map.get(Integer.valueOf(id));
	}
	public  List<Employee> findAllEmployee(){
		Session session = SessionUtil.getSession();    
        Query query = session.createQuery("from Employee");
        List<Employee> employees =  query.list();
		return employees;
	}
}
