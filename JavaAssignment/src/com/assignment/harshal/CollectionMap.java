package com.assignment.harshal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.assignment.entity.Student;

public class CollectionMap {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("India", "Mumbai");
		map.put("England", "London");
		map.put("USA","Washinton");
		
		
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(11, "Java");
		
		HashMap<Integer, Student> map2 = new HashMap<>();
		Student stu = new Student(11,"Java");
		map2.put(11, stu);
		
		for (String string : map.keySet()) {
			System.out.println(string);
		}
		
		System.out.println("-------------------------");
		for (String string : map.values()) {
			System.out.println(string);
		}
		
		System.out.println("-------------------------");
		for (String string : map.keySet()) {
			System.out.println(string + " -- " +map.get(string));
		}
		
		System.out.println("================************=====================");
		
		HashMap<String, List<Student>> studentMap = new HashMap<>();
		Student stu1 = new Student(101,"Java");
		Student stu2 = new Student(102,"Python");
		Student stu3 = new Student(103,"Ruby");
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);	
		
		studentMap.put("Class A", stuList);
		
		Student stu4 = new Student(105,"HTML");
		Student stu5 = new Student(106,"CSS");
		
		List<Student> stuListB = new ArrayList<>();
		stuListB.add(stu1);
		stuListB.add(stu4);
		stuListB.add(stu5);	
		
		studentMap.put("Class B", stuListB);
		
		
		for (String str: studentMap.keySet()) {
			for (Student student : studentMap.get(str)) {
				System.out.println(str + " "+student);
			}
		}
		
		
		//CrudOnArrayList.java
		
		
		
	}

}
