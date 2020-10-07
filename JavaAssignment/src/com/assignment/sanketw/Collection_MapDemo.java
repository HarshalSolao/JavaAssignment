package com.assignment.sanketw;

import java.util.HashMap;

import com.assignment.utility.Student;

public class Collection_MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("England", "London");
		map.put("USA", "California");

		System.out.println("List of keySet values is :");
		System.out.println(map.keySet());

		System.out.println("-----------------------------------");
		System.out.println("List of values is :");
		for (String data1 : map.values()) {
			System.out.println(data1);
		}

		System.out.println("Performing method:");
		System.out.println(map.get("USA"));
		System.out.println(map.replace("USA", "California", "Washington"));

		System.out.println("-----------------------------------");
		System.out.println("Updated list of values is: ");
		for (String data2 : map.values()) {
			System.out.println(data2);
		}

		HashMap<String, Student> col = new HashMap<>();
		Student s11 = new Student(101, "Ruby");
		Student s12 = new Student(102, "Java");
		Student s13 = new Student(103, "Python");
		col.put("Ramesh", s11);
		col.put("Suresh", s12);
		col.put("Ganesh", s13);

		System.out.println("-----------------------------------");
		System.out.println("Student list is:");
		for (String data3 : col.keySet()) {
			System.out.println(data3);
		}

	}

}
