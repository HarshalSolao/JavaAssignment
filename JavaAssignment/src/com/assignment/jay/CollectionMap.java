package com.assignment.jay;

import java.util.HashMap;

public class CollectionMap {

	public static void main(String[] args) {

		HashMap<String, String> freinds = new HashMap<String, String>();

		// clear methode use karne ke liye comment kiya tha below code
		freinds.put("Jay", "Bhakte");
		freinds.put("Sanket", "More");
		freinds.put("Yash", "Ingole");
		freinds.put("Akshay", "Dhoke");
		freinds.put("Vedant", "Datey");

		System.out.println(freinds);

//		get value of key
		System.out.println(freinds.get("Jay"));
		System.out.println(freinds.get("Sanket"));

//		remove kiya
		freinds.remove("Akshay");
		System.out.println(freinds);

		System.out.println(freinds.size());

		freinds.clear();
		System.out.println(freinds);

		// after clearmethode
		System.out.println(freinds.size());

		System.out.println(freinds.isEmpty());
		
		
//	using loop 
		
		for(String freindsj : freinds.keySet()) {
			System.out.println(freindsj);
		}
		
		for (String i : freinds.values()) {
			  System.out.println(i);
			}
		for (String i : freinds.keySet()) {
			  System.out.println("key: " + i + " value: " + freinds.get(i));
			}
	
	//create new map	
		HashMap<String, Integer> deta = new HashMap<String, Integer>();
		
		//add deta
//		deta.put("Jay", 101);
//		deta.put("Sanket", 102);
//		deta.put("Yash", 103);
//		deta.put("Akshay", 104);
//		deta.put("Vedant", 105);
		
		deta.put("Jay", 101);
		deta.put("Sanket", 102);
		deta.put("Yash", 103);
		deta.put("Akshay", 104);
		deta.put("Vedant", 105);
		
		//print deta
		System.out.println(deta);
	
		System.out.println(deta.get("Yash"));
		System.out.println(deta.get("Jay"));
		
		//remove element
		deta.remove("Akshay");
		System.out.println(deta);
		
	  System.out.println(deta.isEmpty());
	  
	  System.out.println(deta);
		
//	  deta.clear();
//	  System.out.println(deta);
		
//		System.out.println(deta.isEmpty());
	  System.out.println(deta.size());
		
//	  using loop
	  
	  for(String i : deta.keySet()) {
		  System.out.println(i);
	  }
	  
	  System.out.println("++++++++++++++++++++++++");
	  for(Integer i : deta.values()) {
		  System.out.println(i);
	  }
	  
	  System.out.println("*****************************");
	  
	  for (String i : deta.keySet()) {
		  System.out.println("key: " + i + " value: " + deta.get(i));
		}
	}
}
