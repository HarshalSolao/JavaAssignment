package com.assignment.jay;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionSetDemo {

	public static void main(String[] args) {
 
		HashSet<Integer> set = new HashSet<>();
		set.add(11);   
		set.add(15);
		set.add(21);
		set.add(25);
		set.add(45);
		set.add(45);
		set.add(null);
		for(Integer integer : set) {
			System.out.println(integer);
		}
		
		LinkedHashSet<Student> set1 = new LinkedHashSet<>();
		Student stu = new Student(11,"java");
		Student stu1 = new Student(12,"python");
		Student stu2 = new Student(13,"ruby");
		Student stu3 = new Student(14,"html");
		
		set1.add(stu);
		set1.add(stu1);
		set1.add(stu2);
		set1.add(stu3);
		set1.add(stu3); //reapeated object nahi leta

		
		
		for(Student student : set1)
		{
		System.out.println(student);	
		}

	}

}
