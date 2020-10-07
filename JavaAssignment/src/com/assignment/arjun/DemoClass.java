

package com.assignment.arjun;



import java.util.ArrayList;
import java.util.HashSet;

import com.assignment.utility.Student;
public class DemoClass{

    public static void main(String[] args) {
        ArrayList<Integer>abc=new ArrayList<>();
        abc.add(91);
        abc.add(92);
        abc.add(93);
        abc.add(94);
        abc.add(95);
        abc.add(96);
        abc.add(97);

        for(Integer a:abc) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("After removing a element at position");
        abc.remove(2);

        for(Integer a:abc) {
            System.out.print(a+" ");
        }

        System.out.println();
        System.out.println("After adding element at position");
        abc.add(2, 120);

        for(Integer a:abc) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Size of Arraylist after removing a element ="+abc.size());
        System.out.println("Creating student type of arrayList");

        ArrayList<Student>sl=new ArrayList<>();
        Student s=new Student(6333,"arjun");
        sl.add(s);
        Student s1=new Student(6552,"sanket");
        sl.add(s1);
        Student s2=new Student(5222,"yash");
        sl.add(s2);
        Student s3=new Student(4555,"jay");
        sl.add(s3);
        for(Student g:sl) {
            System.out.println(g+" ");
        }
        System.out.println("------------------------------------------------------------------------------------");
        HashSet<Integer>hs=new HashSet<>();
        hs.add(550);
        hs.add(440);
        hs.add(330);
        hs.add(220);
        hs.add(110);
        for(Integer g:hs) {
            System.out.print(g+" ");
        }
        hs.add(50);
        System.out.println();
        System.out.println("After adding a same element output is ");
        for(Integer g:hs) {
            System.out.print(g+" ");
        }
        System.out.println();


        HashSet<Student>hs1=new HashSet<>();
        Student h1=new Student(300,"modiji");
        Student h2=new Student(400,"amitshah");
        Student h3=new Student(500,"pappu");
        Student h4=new Student(600,"kejariwal");
        hs1.add(h1);
        hs1.add(h2);
        hs1.add(h3);
        hs1.add(h4);

        for(Student g:hs1) {
            System.out.println(g);
        }
        System.out.println();
        System.out.println("Using Hashset to print arrayList  element");
        HashSet<Integer>hs2=new HashSet<>();
        hs2.addAll(abc);

        for(Integer g:hs2) {
            System.out.println(g+" ");
        }
    }

}
