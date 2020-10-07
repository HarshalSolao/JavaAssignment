package com.assignment.sanketw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.assignment.utility.Student;

public class Collection_SetDemo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(84);
		set.add(56);
		set.add(27);
		set.add(33);

		System.out.println("List is :");
		for (Integer data : set) {
			System.out.println(data);
		}

		set.add(27);
		System.out.println("Updated List is :");
		for (Integer data : set) {
			System.out.println(data);
		}

		Set<Student> stu = new LinkedHashSet<>();
		Student stu1 = new Student(1, "Rohit");
		Student stu2 = new Student(2, "Sahil");
		Student stu3 = new Student(3, "Nikhil");

		stu.add(stu1);
		stu.add(stu2);
		stu.add(stu3);

		System.out.println("Student list is: ");
		for (Student stu4 : stu) {
			System.out.println(stu4);
		}

		stu.remove(stu2);
		System.out.println("Updated Student list is: ");
		for (Student stu4 : stu) {
			System.out.println(stu4);
		}

		Iterator<Integer> it = set.iterator();
		if (it.hasNext()) {
			System.out.println(it.next());
		} else {
			it.remove();
			System.out.println(it);
		}
	}

}
