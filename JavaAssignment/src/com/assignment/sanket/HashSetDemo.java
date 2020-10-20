package com.assignment.sanket;

import com.assignment.entity.*;
import java.util.*;
import java.util.Scanner;

public class HashSetDemo {
	Scanner in = new Scanner(System.in);
	HashSet<Student> student = new HashSet<>();

	int id;
	String name;
	int operation;
	int search;

	public HashSetDemo() {
	}

	public static void main(String[] args) {

		HashSetDemo cp = new HashSetDemo();
		boolean f = true;

		try {
			do {

				cp.getWelcomeData();

				switch (cp.operation) {

				case 1:
					cp.addStudent();
					break;

				case 2:
					cp.searchStudent();
					break;

				case 3:
					cp.updateStudent();
					break;

				case 4:
					cp.deleteStudent();
					break;

				case 5:
					System.out.println("Thank you !!");
					System.out.println();
					System.exit(0);
					break;

				default:
					System.out.println("Please enter valid operaion.");
					break;
				}
			}

			while (f);

		} catch (Exception e) {
			System.out.println("Invalid input ");

		}

	}

	private void deleteStudent() {

		if (student.isEmpty()) {
			System.out.println("No data available to delete.");

			System.out.println("Enter data to get started");

		} else {

			System.out.println("Please enter your id for deleton");
			try {
				id = in.nextInt();
			} catch (Exception e) {
				System.out.println(" Ignore below message and please enter input of integer type only");
				return;
			}
			boolean f = false;
			if (student.isEmpty()) {
				System.out.println("No student in list");
			}

			for (Student stud : student) {

				if (stud.getId() == id) {
					student.remove(stud);
					System.out.println("Student deleted having id : " + id);
					f = true;
					System.out.println();

				}
			}
			if (f == false) {
				System.out.println("No student available with this id");
			}

		}
	}

	private void updateStudent() {

		if (student.isEmpty()) {
			System.out.println("No data available to update.");

			System.out.println("Enter data to get started");

		}

		else {

			System.out.println("Please enter your id for update");
			try {
				id = in.nextInt();
			} catch (Exception e) {
				System.out.println(" Ignore below message and please enter input of integer type only");
				return;
			}
			boolean f = false;
			if (student.size() == 0) {
				System.out.println("Record is empty");
				System.out.println();
				return;
			}

			for (Student stud : student) {

				if (stud.getId() == id) {

					System.out.println("Please enter new name :");
					name = in.next();
					Student stu = new Student();
					stu.setName(name);
					stu.setId(id);
					student.add(stu);

					System.out.println("Student updated as id : " + id + " " + "Name :" + name);
					System.out.println();
					f = true;
					break;
				}
			}
			if (f == false) {
				System.out.print("No record with id :" + id);
				System.out.println();
			}
		}
	}

	private void searchStudent() {

		// search by name
		// search by id
		// search all
		// after taking input from user perform action

		if (student.isEmpty()) {
			System.out.println("No data available to search enter data to get started");
		}

		else {
			getSearchData();
			switch (search) {

			case 1:
				byname();
				break;

			case 2:
				byid();
				break;

			case 3:
				byboth();
				break;

			case 4:
				bylist();
				break;

			case 5:
				System.out.println("Thank you !!");
				System.out.println();
				System.exit(0);
				break;

			default:
				System.out.println("Please enter valid operaion.");

			}
		}
	}

	private void addStudent() {
		System.out.println("Please enter student ID");
		try {
			id = in.nextInt();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter input of integer type only");
			return;
		}

		for (Student stud : student) {

			if (stud.getId() == id) {
				System.out.println("Please enter different id");
				return;
			}
		}

		Student stu = new Student();
		stu.setId(id);

		System.out.println("Please enter student Name:");
		try {
			name = in.next();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter name in words  only");
		}

		stu.setName(name);
		student.add(stu);
		System.out.println("Student added succesfully");

	}

	public void getWelcomeData() {

		System.out.println("======================================================");
		System.out.println("Please select any operation :");
		System.out.println("Press 1 to Add student");
		System.out.println("Press 2 to search student");
		System.out.println("Press 3 to update student");
		System.out.println("Press 4 to delete student");
		System.out.println("Press 5 to exit");
		System.out.println("======================================================");
		operation = in.nextInt();

	}

	public void getSearchData() {
		System.out.println("Press 1 to search student  by name");
		System.out.println("Press 2 to search student by id");
		System.out.println("Press 3 to search student both id and name");

		System.out.println("Press 4 to get list of students with id and name");
		System.out.println("Press 5 to exit");
		try {
			search = in.nextInt();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter input of integer type only");
		}
	}

	private void byname() {
		boolean f = false;

		System.out.println("Please enter your Name :");
		try {
			name = in.next();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter name in words  only");
			return;
		}

		for (Student stud : student) {
			if (stud.getName().equalsIgnoreCase(name)) {
				f = true;
				System.out.println("Record  found with id : " + stud.getId() + " " + "Name :" + stud.getName());

				System.out.println();
			}

			if (f == false) {
				System.out.print("No record with name :" + name);
				System.out.println();
			}

		}
	}

	private void byid() {
		boolean f = false;
		System.out.println("Please enter your id :");
		try {
			id = in.nextInt();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter input of integer type only");
		}

		for (Student stu : student) {
			if (stu.getId() == id) {
				System.out.println("Record found with id :" + stu.getId());
				f = true;
			}
		}

		if (f == false) {
			System.out.print("No record with id :" + id);
			System.out.println();
		}

	}

	private void byboth() {

		boolean f = false;
		System.out.println("Please enter your id :");
		try {
			id = in.nextInt();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter input of integer type only");
		}

		System.out.println("Please enter a name :");
		try {
			name = in.next();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter name in words  only");
		}

		Student stu = new Student(id, name);
		if (student.contains(stu)) {
			System.out.println(stu);
		}

		if (f == false) {
			System.out.println("No record with id :" + id + " " + "Name :" + name);
			System.out.println();
		}
	}

	private void bylist() {

		int count = 0;
		for (Student stud : student) {
			if (student.contains(stud)) {

				System.out.println(stud);
			} else {
				count++;

			}
		}
		if (count == student.size()) {
			System.out.println("No Data available");
			System.out.println();

		}
	}

}
