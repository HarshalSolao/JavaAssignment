package com.assignment.harshal;

import java.util.HashMap;

import com.assignment.utility.Student;

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
		
		
	}

}
