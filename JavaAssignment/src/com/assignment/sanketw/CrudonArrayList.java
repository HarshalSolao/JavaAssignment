package com.assignment.sanketw;

import java.util.ArrayList;
import java.util.Scanner;

import com.assignment.utility.Student;

public class CrudonArrayList {
	Scanner in = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<>();

	int id;
	String name;
	int operation;
	int search;

	public static void main(String[] args) {
		CrudonArrayList sd = new CrudonArrayList();
		boolean flag = true;

		try {
			do {
				sd.getWelcomeData();

				switch (sd.operation) {
				case 1:
					sd.addStudent();
					break;
				case 2:
					sd.searchStudent();
					break;
				case 3:
					sd.updateStudent();
					break;
				case 4:
					sd.deleteStudent();
					break;
				case 5:
					System.out.println("Thank you !!");
					System.out.println();
					System.exit(0);
					break;
				default:
					System.out.println("Please enter valid operation.");
					break;
				}
			} while (flag);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
	}

	private void deleteStudent() {
		boolean flag = false;
		System.out.println("Please enter your Id for deletion :");
		id = in.nextInt();

		for (int i = 0; i < students.size(); i++) {
			if (students.size() != 0) {
				if (students.get(i).getId() == id) {
					flag = true;
					students.remove(i);

					System.out.println("Student deleted successfully");
					System.out.println();

				}
			}
		}

		if (!flag) {
			System.out.println("No record with id : " + id);
			System.out.println();
		}

	}

	private void updateStudent() {
		boolean flag = false;
		System.out.println("Enter Student ID for Update : ");
		id = in.nextInt();

		for (int i = 0; i < students.size(); i++) {
			if (students.size() != 0) {
				if (students.get(i).getId() == id) {
					flag = true;
					System.out.println("Please Enter New Name : ");
					name = in.next();
					Student stu = new Student();
					stu.setName(name);
					stu.setId(id);
					students.set(i, stu);

					System.out.println("Student updated successfully");
					System.out.println();

				}
			}
		}

		if (!flag) {
			System.out.println("No record with id : " + id);
			System.out.println();
		}

	}

	private void searchStudent() {

		// Search by name press 1
		// Search by Id press 2
		// Search all press 3
		// After taking input perform action
		System.out.println(
				"Please press : 1 to search by name, 2 to search by Id, 3 to search by all and 4 to print data of all students");
		search = in.nextInt();

		switch (search) {
		case 1:
			System.out.println("Please enter the name:");
			name = in.next();
			for (Student stu : students) {
				if (stu.getName().equalsIgnoreCase(name)) {
					System.out.println(stu);
				}
			}
			break;
		case 2:
			System.out.println("Please enter the Id:");
			id = in.nextInt();
			for (Student stu : students) {
				if (stu.getId() == id) {
					System.out.println(stu);
				}
			}
			break;
		case 3:
			System.out.println("Please enter the name:");
			name = in.next();
			System.out.println("Please enter the Id:");
			id = in.nextInt();
			Student stu = new Student();
			stu.setId(id);
			stu.setName(name);
			if (stu.getId() == id && stu.getName().equalsIgnoreCase(name)) {
				System.out.println(stu);
			} else {
				System.out.println("No student found with id : " + id);
				System.out.println();
			}
			System.out.println();
			break;
		case 4:
			System.out.println(students);
			break;
		default:
			System.out.println("Please enter valid operation to search the student");
			break;

		}

	}

	private void addStudent() {
		System.out.println("Please Enter Student ID");
		id = in.nextInt();
		System.out.println("Please Enter Student Name : ");
		name = in.next();

		Student stu = new Student();
		stu.setId(id);
		stu.setName(name);
		students.add(stu);
	}

	public void getWelcomeData() {
		System.out.println("================================================");
		System.out.println("Please select any Operation : ");
		System.out.println("Press 1 for Add Student");
		System.out.println("Press 2 for Search Student");
		System.out.println("Press 3 for Update Student");
		System.out.println("Press 4 for Delete Student");
		System.out.println("Press 5 for Exit");
		System.out.println("================================================");
		operation = in.nextInt();

	}

}
