package com.assignment.sanket;

import java.util.*;

import com.assignment.utility.Student;

public class CollectionDemo {

	public static void main(String[] args) {

//arraylist

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Mango");
		// Printing the arraylist object
		System.out.println(list);

		// traverse ArrayList elements using the Iterator interface.

		ArrayList<String> list1 = new ArrayList<String>();// Creating arraylist
		list1.add("Mango");// Adding object in arraylist
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		// Traversing list through Iterator
		Iterator itr = list1.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		} // useful for determining unique values among large data.

		// =============================================

		int arr[] = new int[10];

		List<Integer> arrList = new LinkedList<>(); // it not gives unique values.
		arrList.add(10);
		arrList.add(10);
		arrList.add(24);
		arrList.add(36);
		arrList.add(13);
		arrList.add(24);
		arrList.add(36);

		HashSet<Integer> set = new HashSet<>(); //
		set.addAll(arrList);

		for (Integer integer : set) {
			System.out.println(integer);
		}

		// Traversing list through Iterator
		Iterator itr1 = list1.iterator();// getting the Iterator
		while (itr1.hasNext()) {// check if iterator has the elements
			System.out.println(itr1.next());// printing the element and move to next

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
			arrListstr.add("Aa");
			arrListstr.add("Bb");
			arrListstr.add("Cc");

			for (String string : arrListstr) {
				System.out.println(string);
			}

			ArrayList<Student> stuList = new ArrayList<>();
			Student stu = new Student(101, "Java");
			stuList.add(stu);

			Student stu1 = new Student(102, "Python");
			stuList.add(stu1);

			// stuList.remove(1);

			stuList.remove(stu);
			stuList.add(null);
			stuList.add(null);

			for (Student student : stuList) {
				System.out.println(student);
			}

			HashSet<Integer> set1 = new HashSet<>(); // no repetation
			set1.add(11);
			set1.add(12);
			set1.add(13);
			set1.add(14);
			set1.add(15);
			set1.add(14);
			set1.add(null);

			for (Integer integer : set1) {
				System.out.println(integer);
			}

			System.out.println("-------------");

			LinkedHashSet<Student> set11 = new LinkedHashSet<>();
			Student stu11 = new Student(1, "Java");
			Student stu111 = new Student(2, "Python");
			Student stu2 = new Student(3, "Ruby");

			set11.add(stu11);
			set11.add(stu111);
			set11.add(stu2);

			for (Student student : set11) {
				System.out.println(student);
			}

		}
	}
}
