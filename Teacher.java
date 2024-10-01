package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//creating a class which will implement the comaparable interface
class Teacher implements Comparable<Teacher> {

	int id;
	String name;
	double salary;
	//Parameterized Constructor
	
	Teacher(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Teacher o)
	{
		if(salary==o.salary)
		{
			return 0;
		}
		else if(salary>o.salary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}
class Main3 {

	public static void main(String[] args) {
		
		ArrayList<Teacher> t1 = new ArrayList<Teacher>();
		t1.add(new Teacher(101, "kkm", 23000));
		t1.add(new Teacher(102, "pkm", 15000));
		t1.add(new Teacher(103, "skm", 25502));
		t1.add(new Teacher(104, "lkm", 35004));
		
		Collections.sort(t1);
		
		for(Teacher obj:t1)
		{
			System.out.println(obj.id+ " "+obj.name+ " "+obj.salary);
		}
		
		

	}

}
