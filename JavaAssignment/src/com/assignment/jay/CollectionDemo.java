package com.assignment.jay;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDemo {

	public static void main(String[] args) {
int arr[] = new int[10];

ArrayList<Integer> arrList = new ArrayList<>();
arrList.add(65);
arrList.add(56);
arrList.add(25);
arrList.add(14);
arrList.add(14);

HashSet<Integer> set = new HashSet<>();
set.addAll(arrList);

for(Integer integer : set) {
	System.out.println(integer);
}


System.out.println("=======================");

for (Integer integer : arrList) {
	System.out.println(integer);
}

 arrList.add(3, 121);
 arrList.remove(1);
 
 
System.out.println(arrList.contains(14)); 
 System.out.println(arrList.contains(45));
 System.out.println(arrList.isEmpty());
 System.out.println(arrList.size());
 
 

System.out.println("---------------------------------");

for(Integer integer : arrList) {
	System.out.println(integer);
}



ArrayList<String> arrStr = new ArrayList<>();
arrStr.add("Java");
arrStr.add("Python");
arrStr.add("Ruby");
arrStr.add("HTML");


for(String string : arrStr) {
	System.out.println(string);
}

System.out.println("***************************************");
ArrayList<Student> stuList = new ArrayList<>();
Student stu = new Student(101,"Java");
stuList.add(stu);

Student stu1 = new Student(102,"Python");
stuList.add(stu1);

Student stu2 = new Student(103,"HTML");
stuList.add(stu2);


stuList.remove(2); //removed by using index of object
stuList.remove(stu1); //removed by using object name
stuList.add(stu1); //after deleting we adding object stu1 
System.out.println(stuList.size());//checking size of arrayList
stuList.add(null);


for(Student student : stuList) {
	System.out.println(student);
}

  
	}

}
