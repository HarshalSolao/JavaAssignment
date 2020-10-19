package com.assignment.yash;
import java.util.HashSet;
import java.util.Scanner;
import com.assignment.entity.*;

public class CrudOnHashSet {
	 Scanner sc=new Scanner(System.in);
		HashSet<Student>hs=new HashSet<>(); 
		int id;
		String name;
		int operation; 
		int s; 
		String na;
	public static void main(String[] args) {
	   CrudOnHashSet ch=new CrudOnHashSet(); 
	   boolean f = true;
		
		try {  
			do {
	
		ch.getWelcomeData();

	 switch (ch.operation) {
		case 1:
			ch.addStudent();
			break;
		case 2:
			ch.printStudent();
			break;
		case 3:
			ch.updateStudent();
			break;
		case 4:
			ch.deleteStudent();
			break; 
		case 5: 
			ch.search(); 
			break; 
		
		case 6:
			System.out.println("Thank you !!");
			System.out.println();
			System.exit(0);
			break;
		default:
			System.out.println("Please Enter valid operation.");
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
		try {id = sc.nextInt();}  
		catch(Exception e) { 
			System.out.println("invalid id"); 
			return;
		} 
		for (Student student : hs) {
		     if(student.getId()==id) { 
		    	 System.out.println("This id student already exist please enter another id");
		    	 id=sc.nextInt();
		    	 break;
		     }
		}  
		
		
		Student stu = new Student();
		stu.setId(id); 
	  
       
	
		System.out.println("Please Enter Student Name : ");
		name = sc.next(); 
		
		
		
		stu.setName(name);  
		hs.add(stu); 
		System.out.println("Student added successfully"); 
		} 
	private void printStudent() { 
		if(hs.size()==0) { 
			System.out.println("No data Available"); 
			System.out.println();
		} 
		else { 
			for (Student student : hs) {
				System.out.println(student);
			}
			}
		} 
	private void updateStudent() { 
	
		System.out.println("Enter Student ID for Update : ");
		
		try {id = sc.nextInt();}  
		catch(Exception e) { 
			System.out.println("invalid id"); 
			return;
		}  
		boolean f=false;
		for (Student student : hs) { 
			if(student.getId()==id) { 
				 System.out.println("Please Enter the new Name"); 
				 name=sc.next(); 
				 student.setName(name); 
				 System.out.println("Student updated successfully");
					System.out.println(); 
					f=true;
			}
			
		} 
		if(f==false) { 
			System.out.println("No such student exist in our record of id : " + id);
			System.out.println();
		}




	  }
	  
private void deleteStudent() { 
	System.out.println("Enter the student id and name to delete");
	try {
		id = sc.nextInt();
	} catch (Exception e) {
		System.out.println("invalid id");
		return;
	} 
	boolean f=false;
	for (Student student : hs) { 
		if(student.getId()==id) { 
			hs.remove(student); 
			System.out.println("Student is removed");
		   f=true; 
		   return;
		}
	
			
	} 
	if(f==false) { 
		System.out.println("No such student exist in our record of id : " + id);
		System.out.println();
	}
} 
private void search() {
	System.out.print("Enter the id");
	System.out.println();
	boolean f = false;
	try {
		id = sc.nextInt();
	} catch (Exception e) {
		System.out.println("invalid id");
		return;
	}
	for (Student student : hs) { 
		if(student.getId()==id) { 
			
			System.out.println(student);
		   f=true;
		}
		
		 
	} 
	if(f==false) { 
		System.out.println("No such student exist");
	}}
	  
	 
	public void getWelcomeData() {
		System.out.println("================================================");
		System.out.println("Please select any Operation : ");
		System.out.println("Press 1 for Add Student");
		System.out.println("Press 2 for print a Student");
		System.out.println("Press 3 for Update Student");
		System.out.println("Press 4 for Delete Student"); 
		System.out.println("Press 5 for search "); 
		System.out.println("Press 6 for Exit");
		System.out.println("================================================");
	  	operation = sc.nextInt();
	 
		 
	
}
	

}
