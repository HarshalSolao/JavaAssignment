package com.assignment.sanket;

import java.util.ArrayList;
import java.util.Scanner;
import com.assignment.utility.Student;

public class CrudOnArrayList {
	Scanner in = new Scanner(System.in);
	ArrayList<Student> student = new ArrayList<>();

	int id;
	String name;
	int operation;
	int search;

	public static void main(String[] args) {

		CrudOnArrayList cp = new CrudOnArrayList();
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
		System.out.println("Please enter your id for deleton");
		try {
			id = in.nextInt();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter input of integer type only");
			return;
		}
		boolean f = false;
		if (student.size() == 0) {
			System.out.println("No student in list");
		}
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getId() == id) {
				student.remove(i);
				System.out.println("Student deleted having id : " + id);
				f = true;
				System.out.println();

			}
		}
		if (f == false) {
			System.out.println("No student available with this id");
		}

	}

	private void updateStudent() {

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

		for (int i = 0; i < student.size(); i++) {

			if (student.get(i).getId() == id) {

				System.out.println("Please enter new name :");
				name = in.next();
				Student stu = new Student();
				stu.setName(name);
				stu.setId(id);
				student.add(i, stu);

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

	private void searchStudent() {

		// search by name
		// search by id
		// search all
		// after taking input from user perform action

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

		/*
		 * int count =1; for(int i=0; i < students.length; i++) { if(null!=students[i])
		 * {
		 * 
		 * System.out.println(students[i]); } else { count++;
		 * 
		 * } } if (count ==students.length) { System.out.println("No Data available");
		 * System.out.println();
		 * 
		 * }
		 */
	}

	private void addStudent() {
		System.out.println("Please enter student ID");
		try {
			id = in.nextInt();
		} catch (Exception e) {
			System.out.println(" Ignore below message and please enter input of integer type only");
			return;
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

	public void getWelcomeData()  {

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

		for (int i = 0; i < student.size(); i++) {
			if (null != student.get(i)) {
				if (student.get(i).getName().equalsIgnoreCase(name)) {
					f = true;
					System.out.println("Record  found with id : " + student.get(i).getId() + " " + "Name :"
							+ student.get(i).getName());

					System.out.println();
				}
			}
		}
		if (f == false) {
			System.out.print("No record with id :" + name);
			System.out.println();
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

		for (int i = 0; i < student.size(); i++) {
			if (null != student.get(i)) {
				if (student.get(i).getId() == id && student.get(i).getName().equalsIgnoreCase(name)) {
					f = true;
					System.out.println("Record found with id :" + student.get(i).getId() + " " + "Name :"
							+ student.get(i).getName());

					System.out.println();
				}
			}
		}

		if (f == false) {
			System.out.println("No record with id :" + id + " " + "Name :" + name);
			System.out.println();
		}
	}

	private void bylist() {

		int count = 0;
		for (int i = 0; i < student.size(); i++) {
			if (null != student.get(i)) {

				System.out.println(student.get(i));
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
