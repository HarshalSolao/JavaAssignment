package com.assignment.yash;

import java.util.HashMap;


import com.assignment.utility.Student;

public class CollectionMap1 {

	public static void main(String[] args) {
	
		HashMap<String,Integer>hs=new HashMap<>();
        hs.put("Rohit",23);  
        hs.put("Ajay",32); 
        hs.put("Om",43); 
        hs.put("Kumar",54); 
        hs.put("Karan",21); 
        hs.put("bhavesh",97); 

	 System.out.println(hs); 
	 hs.remove("Rohit"); 
	 System.out.println(hs); 
	 System.out.println("Using student class in map");
		HashMap<Student,String>hs1=new HashMap<>();
	   Student s1=new Student(12,"Ram"); 
	   Student s2=new Student(43,"xi"); 
	   Student s3=new Student(123,"Alex"); 
	   Student s4=new Student(45,"Siddesh"); 
	   hs1.put(s1,"India"); 
	   hs1.put(s2, "China"); 
	   hs1.put(s3, "Usa"); 
	   hs1.put(s4, "India"); 
	   for(Student s:hs1.keySet()) { 
		System.out.println(s);     
		
	   
	   }  
	   
	 
	   }
	
	
	
	

	}


