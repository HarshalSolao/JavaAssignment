package com.assignment.sanket;

import java.util.HashMap;

import com.assignment.utility.Student;

public class CollectionMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer>hs=new HashMap<>();
        hs.put("Ram",18);  
        hs.put("shyam",36); 
        hs.put("Jam",72); 
        hs.put("Ravan",49); 
        hs.put("Krishna",21); 
   	 System.out.println(hs);
   	 System.out.println();
	 
   	 hs.remove("Jam", 72) ;
	 System.out.println(hs);
	 System.out.println();
	 
	 System.out.println("Size of Hashmap is :"+" "+hs.size());
	 System.out.println();
	
	 System.out.println(" student class :");
	 System.out.println();	
	
	 HashMap<Student,String>hs1=new HashMap<>();
	   Student s1=new Student(22,"Aa"); 
	   Student s2=new Student(87,"Bb"); 
	   Student s3=new Student(62,"Cc"); 
	   Student s4=new Student(46,"Dd"); 
	   hs1.put(s1,"aaaa"); 
	   hs1.put(s2, "bbbb"); 
	   hs1.put(s3, "cccc"); 
	   hs1.put(s4, "dddd"); 
	  
	   for(String s:hs1.values()) { 
		System.out.println(s);     
	   }
		 for(Student s11:hs1.keySet()) { 
				System.out.println(s11);     
				
			   
			   }   
	

	}}
