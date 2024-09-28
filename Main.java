package com.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args)
	{
		ArrayList<Employee> e1 = new ArrayList<Employee>();
		e1.add(new Employee(101, "Karuna", 45000));
		e1.add(new Employee(105, "priya", 25000));
		e1.add(new Employee(104, "riya", 55000));
		e1.add(new Employee(103, "Ritika", 15000));
		
		
		Collections.sort(e1);
		
		
		for(Employee obj:e1)
		{
			System.out.println(obj.id+ " "+obj.name+ " "+obj.salary);
		}
		

		
	}

}
