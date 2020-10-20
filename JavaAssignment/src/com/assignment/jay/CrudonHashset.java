package com.assignment.jay;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CrudonHashset {
	Scanner in = new Scanner(System.in);  
	HashSet<Student> students = new HashSet<>();
	int id;
	String name;
	int operation;
	int search;

	public static void main(String[] args) {

//		Student stu = new Student(); 
		CrudonHashset sd = new CrudonHashset();

		boolean flag = true;
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

	}

	private void deleteStudent() {
		CrudonHashset sd = new CrudonHashset();
		
	char d = 'y';
	System.out.println("You really want to delete student data");
	System.out.println();
	System.out.println(" If yes please press 'y' if no then press 'n' ");
	d = in.next().charAt(0);
	if(d == 'y') {
		
		System.out.println("Please enter your Id for deletion :");
		id = in.nextInt();

		for(Student i : students) {
			 
				if (i.getId()== id) {
					students.remove(i);
					System.out.println("Student deleted having id : " + id);
					System.out.println();
				
			}
				break;	}
		}
	if (d == 'n') {
		sd.getWelcomeData();
	}

	}

	private void updateStudent() {
		CrudonHashset sd = new CrudonHashset();
		boolean flag = false;
		char f = 'Y';

		System.out.println("You really want to update Student deta");
		System.out.println();
		System.out.println("Please press 'Y' for yes or press 'N' ");
		f = in.next().charAt(0);
		if (f == 'Y') {
			try {
				System.out.println("Enter Student ID for Update : ");
				id = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("PLEASE ENTER ID OF STUDENT NOT NAME!!!!");
			}

			for(Student i  : students) {
				flag = true;
				System.out.println("Please Enter New Name : ");
				name = in.next();
				i.setName(name);

				
				System.out.println("Student updated successfully");
				System.out.println();
break;
			}


			if (!flag) {
				System.out.println("No record with id : " + id);
				System.out.println();
			}

		}
		if (f == 'N') {
			sd.getWelcomeData();
		}
	}

	private void searchStudent() {
		boolean flag=false;
		System.out.println("Press 1 for Searching by name or " + "Press 2 for Searching by id or "
				+ "Press 3 for Searching by both" + "Press 4 for LIST of Students");

		search = in.nextInt();
		switch (search) {

		case 1:
			try {
				System.out.println("Enter Student Name:");
				name = in.next();
			} catch (Exception e) {
				System.out.println("ONLY Enter Name !!!");
			}

			for (Student stu : students) {
				
					
					if (stu.getName().equalsIgnoreCase(name) ) {
						flag = true;
						System.out.println("Record found by Name : " + " " + stu.getName());
					
				}
					if (!flag) {
						System.out.println("No record Found");
						System.out.println();
				}
				
			}
			System.out.println();
			break;
		case 2:
			try {

				System.out.println("Enter Student ID:");
				id = in.nextInt();
			} catch (Exception e) {
				System.out.println("Please Enter proper ID !!");
				return;
			}
			for (Student stu1 : students) {
				if (stu1.getId() == id) {
					flag = true;
					System.out.println("Record found by ID = " + " " + id);
				}
				if (!flag) {

					System.out.println("Please provide valid Id");
				}
			}
			System.out.println();
			break;
		case 3:
			try {
				System.out.println("Enter student Name");
				name = in.next();
			} catch (Exception e) {
				System.out.println("ONLY Enter Name !!!");
				return;
			}
			try {
				System.out.println("Enter Student ID");
				id = in.nextInt();
			} catch (Exception e) {
				System.out.println("Please Enter proper ID !!");
				return;
			}

			Student stu = new Student();
			stu.setName(name);
			stu.setId(id);
			students.contains(stu);
			students.remove(stu);
			System.out.println(stu);
			System.out.println();
			break;
		case 4:
			System.out.println();
			for (Student stu1 : students) {
				System.out.println(stu1);
			}
		}

	}

	private void addStudent() {

		Student stu = new Student();
		try {
			System.out.println("Please Enter Student ID");
			id = in.nextInt();
		} catch (Exception e) {
			System.out.println("Please Enter proper ID !!");
			System.out.println();
			return;
		}
		try {
			System.out.println("Please Enter Student Name : ");
			name = in.next();
		} catch (Exception e) {
			System.out.println("Only Enter Name!!");
			System.out.println();
			return;
		}

		stu.setId(id);
		stu.setName(name);
		students.add(stu);
//		for (Student stu1 : students) {
//			System.out.println(stu1);
//		}

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