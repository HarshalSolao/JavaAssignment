package com.assignment.harshal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.assignment.utility.Student;

public class CollectionDemo {

	public static void main(String[] args) {

		int arr[] = new int[10];
		
		List<Integer> arrList = new LinkedList<>();
		arrList.add(10);
		arrList.add(13);
		arrList.add(24);
		arrList.add(36);
		arrList.add(13);
		arrList.add(24);
		
		HashSet<Integer> set = new HashSet<>();
		set.addAll(arrList);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
		System.out.println("-================================");
		
		for (Integer integer : arrList) {
			System.out.println(integer);
		}
		
		arrList.remove(2);	
		
		System.out.println("--------------");
		
		for (Integer integer : arrList) {
			System.out.println(integer);
		}	
		
		ArrayList<String> arrListstr = new ArrayList<>();
		arrListstr.add("Java");
		arrListstr.add("Python");
		arrListstr.add("Ruby");
		
		for (String string : arrListstr) {
			System.out.println(string);
		}
		
		ArrayList<Student> stuList = new ArrayList<>();
		Student stu = new Student(101, "Java");
		stuList.add(stu);
		
		Student stu1 = new Student(102, "Python");
		stuList.add(stu1);
		
		//stuList.remove(1);
		
		stuList.remove(stu);
		stuList.add(null);
		stuList.add(null);
		
		for (Student student : stuList) {
			System.out.println(student);
		}
		
		
		
		
	}

}
