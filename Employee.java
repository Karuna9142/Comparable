package com.Comparable;

/*
 Comparable (single sorting sequence)
 1.implement comparable
 2.override comparable
 */
public class Employee implements Comparable<Employee>
{
  int id;
  String name;
  int salary;
  
  Employee(int id, String name, int salary)
  {
	  this.id = id;
	  this.name = name;
	  this.salary = salary;
  }
	@Override
	public int compareTo(Employee o)
	{
		if(salary==o.salary)
			return 0;
		else if(salary>o.salary)
			return 1;
		else
			return-1;
	}

}
