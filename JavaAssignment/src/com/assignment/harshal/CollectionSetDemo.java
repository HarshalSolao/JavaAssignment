package com.assignment.harshal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import com.assignment.entity.Student;

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
		
		List<Student> set1 = new ArrayList();
		Student stu = new Student(11, "Java");
		Student stu1 = new Student(11, "Python");
		Student stu2 = new Student(11, "Java");
		
		set1.add(stu);
		set1.add(stu1);
		set1.add(stu2);
		set1.add(stu1);
		
		set1.get(2);
		
		for (Student student : set1) {
			System.out.println(student.getId() + " " + student.getName());
		}
		
		
		
		
	}

}
