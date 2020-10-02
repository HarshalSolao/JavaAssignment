  package com.assignment.akshay;
  
  public class Mainclass {
			
			 int rollno; 
			 String name;  
			 String city;  
			  
	 Mainclass(int rollno, String name, String city){  
			 this.rollno=rollno;  
			 this.name=name;  
			 this.city=city;  
			 }  
			 
			@Override
			public String toString() {
				return "Mainclass [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
			}
			
	    public static void main(String[] args) {
				
				   Mainclass s1=new Mainclass(97,"aksahy","Amravati");  
				   
				   System.out.println(s1);
				   
		}  

     	}
