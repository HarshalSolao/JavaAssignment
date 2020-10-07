package com.assignment.yash;

import java.util.ArrayList;
import java.util.HashSet;

import com.assignment.utility.Student;

public class CollectionDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(54);
		al.add(32);
		al.add(56);
		al.add(15);
		al.add(87);
		al.add(67);

		for (Integer a : al) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("After removing a element at position");
		al.remove(2);
		for (Integer a : al) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("After adding element at position");
		al.add(2, 100);
		for (Integer a : al) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Size of Arraylist after removing a element =" + al.size());
		System.out.println("Creating student type of arrayList");
		ArrayList<Student> sl = new ArrayList<>();
		Student s = new Student(2234, "Yash");
		sl.add(s);
		Student s1 = new Student(4535, "Raj");
		sl.add(s1);
		Student s2 = new Student(7654, "Veraj");
		sl.add(s2);
		Student s3 = new Student(76847, "Ajay");
		sl.add(s3);
		for (Student g : sl) {
			System.out.println(g + " ");
		}
		System.out.println("------------------------------------------------------------------------------------");
		HashSet<Integer> hs = new HashSet<>();
		hs.add(34);
		hs.add(17);
		hs.add(56);
		hs.add(73);
		hs.add(19);
		for (Integer g : hs) {
			System.out.print(g + " ");
		}
		hs.add(19);
		System.out.println();
		System.out.println("After adding a same element output is ");
		for (Integer g : hs) {
			System.out.print(g + " ");
		}
		System.out.println();
		HashSet<Student> hs1 = new HashSet<>();
		Student h1 = new Student(123, "Tony");
		Student h2 = new Student(231, "Sam");
		Student h3 = new Student(653, "Alex");
		Student h4 = new Student(334, "Rock");
		hs1.add(h1);
		hs1.add(h2);
		hs1.add(h3);
		hs1.add(h4);
		for (Student g : hs1) {
			System.out.println(g);
		}
		System.out.println();
		System.out.println("Using Hashset to print arrayList  element");
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.addAll(al);
		for (Integer g : hs2) {
			System.out.println(g + " ");
		}
	}

}
