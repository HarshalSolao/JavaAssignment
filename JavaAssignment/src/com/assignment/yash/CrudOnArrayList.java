package com.assignment.yash;

import java.util.ArrayList;
import java.util.Scanner;
import com.assignment.utility.*;
public class CrudOnArrayList {

	Scanner in = new Scanner(System.in);
	ArrayList<Student>student=new ArrayList<>();
	
	int id;
	String name;
	int operation; 
	int s; 
	String na;

	public static void main(String[] args) {
		CrudOnArrayList sd=new CrudOnArrayList();
		boolean f = true;
	
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
				sd.search(); 
				break; 
			
			case 6:
				System.out.println("Thank you !!");
				System.out.println();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid operation.");
				break;

			}  }
		 
			while (f); 
				} 
			catch(Exception e) { 
				System.out.println("Something went wrong!!"); 
				
			}
		 
		
		
	} 
	private void addStudent() { 
	
		System.out.println("Please Enter Student ID");		
		try {id = in.nextInt();}  
		catch(Exception e) { 
			System.out.println("invalid id"); 
			return;
		}
		Student stu = new Student();
		stu.setId(id); 
	  
 
	
		System.out.println("Please Enter Student Name : ");
		name = in.next(); 
		
		
		
		stu.setName(name);  
		student.add(stu); 
		System.out.println("Student added successfully"); 
		}
	
	private void searchStudent() { 
		if(student.size()==0) { 
			System.out.println("No data Available"); 
			System.out.println();
		} 
		else { 
			for(int i=0;i<student.size();i++) { 
				System.out.println(student.get(i));
			}
		}
	} 
	private void updateStudent() {
		System.out.println("Enter Student ID for Update : ");
		try {id = in.nextInt();}  
		catch(Exception e) { 
			System.out.println("invalid id"); 
			return;
		} 
		boolean f=false;
if(student.size()==0) { 
	System.out.println("Their is no student in list for upadate"); 
	System.out.println(); 
	return;
}  

  for(int i=0;i<student.size();i++) { 
	  if(student.get(i).getId()==id) { 
		 System.out.println("Please Enter the new Name");
		 name=in.next();  
		 Student stu = new Student(); 
		 stu.setName(name); 
		 stu.setId(id);
		 student.set(i, stu); 
		 
		 System.out.println("Student updated successfully");
			System.out.println();
		 f=true;
	  }
	  
  } 
  if(f==false) { 
	  System.out.println("No record with id : " + id);
		System.out.println();
  }
		
	}  
	private void deleteStudent() {
		System.out.println("Please enter your Id for deletion :");
		try {id = in.nextInt();}  
		catch(Exception e) { 
			System.out.println("invalid id"); 
			return;
		}
		boolean f=false;  
		if(student.size()==0) { 
			System.out.println("No student in list");
		}
		  for(int i=0;i<student.size();i++) { 
			  if(student.get(i).getId()==id) {  
				  student.remove(i); 
				  f=true;  
				  System.out.println("Student is deleted");
			  }
			  } 
		  if(f==false) { 
			  System.out.println("No such student with given id is available");
		  }
	
	} 
	private void search() { 
		System.out.print("Enter the id");  
		System.out.println();
		boolean f=false;
		try {id = in.nextInt();}  
		catch(Exception e) { 
			System.out.println("invalid id"); 
			return;
		}  
	
			
		
		for(int i=0;i<student.size();i++) { 
			if(student.get(i).getId()==id) {
			   	System.out.println("Name of student is ="+student.get(i).getName()+" Student id is ="+id);
			   f=true;
			}
		} 
		if(f==false) { 
			System.out.println("Student is not available in list");
		}
	}
	public void getWelcomeData() {
		System.out.println("================================================");
		System.out.println("Please select any Operation : ");
		System.out.println("Press 1 for Add Student");
		System.out.println("Press 2 for Search Student");
		System.out.println("Press 3 for Update Student");
		System.out.println("Press 4 for Delete Student"); 
		System.out.println("Press 5 for search"); 
		System.out.println("Press 6 for Exit");
		System.out.println("================================================");
	  	operation = in.nextInt();
	 
		 
	
}
	
	
}
