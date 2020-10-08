package com.assignment.sanketw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

		System.out.println("-----------------------------------");
		HashMap<String, List<Student>> studentMap = new HashMap<>();
		Student stu1 = new Student(1001, "Mohit");
		Student stu2 = new Student(1002, "Rohit");
		Student stu3 = new Student(1003, "Soham");

		List<Student> stuList = new ArrayList<>();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);

		studentMap.put("Section B", stuList);

		Student stu4 = new Student(1004, "Virat");
		Student stu5 = new Student(1005, "Mahendra");
		Student stu6 = new Student(1006, "Nikhil");

		List<Student> stuListB = new ArrayList<>();
		stuListB.add(stu6);
		stuListB.add(stu4);
		stuListB.add(stu5);

		studentMap.put("Section C", stuListB);

		for (String str : studentMap.keySet()) {
			for (Student student : studentMap.get(str)) {
				System.out.println(str + " " + student);
			}
		}

	}

}
