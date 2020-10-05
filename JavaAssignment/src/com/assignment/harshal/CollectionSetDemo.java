package com.assignment.harshal;

import java.util.HashSet;
import java.util.LinkedHashSet;

import com.assignment.utility.Student;

public class CollectionSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(14);
		set.add(null);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		System.out.println("-------------");
		
		LinkedHashSet<Student> set1 = new LinkedHashSet<>();
		Student stu = new Student(11, "Java");
		Student stu1 = new Student(11, "Python");
		Student stu2 = new Student(11, "Ruby");
		
		set1.add(stu);
		set1.add(stu1);
		set1.add(stu2);
		set1.add(stu1);
		
		
		for (Student student : set1) {
			System.out.println(student);
		}
		
	}

}
