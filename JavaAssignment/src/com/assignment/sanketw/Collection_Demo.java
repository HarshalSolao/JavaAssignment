package com.assignment.sanketw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_Demo {

	public static void main(String[] args) {

		ArrayList<Integer> arlist = new ArrayList<>();
		arlist.add(10);
		arlist.add(26);
		arlist.add(26);
		arlist.add(58);
		arlist.add(89);
		arlist.add(67);

		System.out.println("Arraylist of nos. is: ");
		for (Integer data : arlist) {
			System.out.println(data);
		}

		System.out.println("Using methods on Arraylist :");
		System.out.println(arlist.contains(26));
		System.out.println(arlist.size());
		System.out.println(arlist.isEmpty());
		System.out.println(arlist.get(3));
		arlist.add(2, 34);
		arlist.add(4, null);
		arlist.remove(6);
		arlist.remove(3);
		System.out.println("Arraylist after performing operations :");
		for (Integer data : arlist) {
			System.out.println(data);
		}
		System.out.println("----------------------------------------------------------------");
		LinkedList<String> arlist1 = new LinkedList<>();
		arlist1.add("spade");
		arlist1.add("diamond");
		arlist1.add("hearts");
		arlist1.add("clubs");

		System.out.println("Arraylist of cards is:");
		for (String data1 : arlist1) {
			System.out.println(data1);
		}

		List<String> list = new LinkedList<>();
		list.addAll(arlist1);

		arlist1.removeAll(arlist1);
		System.out.println("Arraylist of cards now is: empty");
		for (String data1 : arlist1) {
			System.out.println(data1);
		}

		System.out.println("List is:");
		for (String data2 : list) {
			System.out.println(data2);
		}

	}

}
