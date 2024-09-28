package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

	public static void main(String[] args) 
	{
	  ArrayList<Student>a1 = new ArrayList<Student>();
	  a1.add(new Student(12, "Riya",22));
	  a1.add(new Student(14, "Siya", 18));
	  a1.add(new Student(4,"Madhu", 34));
	  
	  Collections.sort(a1);
	  
	  for(Student obj:a1)
	  {
		  System.out.println(obj.rollno+ " "+obj.name+ " "+obj.age);
	  }

	}

}
