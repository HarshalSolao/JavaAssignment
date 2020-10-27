package com.assignment.sanket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;

public class Practice_on_Sorting_23_10_2020 {

// <1> In Comparable CompareTo() method with needs first implement in Car.java
//  <2>  comparator can be directly used .which is main advantage of it.

	public static void main(String[] args) {
		List<Car> cars = UploadFileData.readDataFromFile();
		Set<Car> carSet = new HashSet<>();

		carSet.addAll(cars);
		Comparator<Car> cm1 = Comparator.comparing(Car::getColor);

		Collections.sort(cars, cm1);

		for (Car car : cars) {
			System.out.println(car);

		}
		List<String> nameList = new ArrayList();
		nameList.add("Z");
		nameList.add("A");
		nameList.add("C");
		nameList.add("D");
		nameList.add("Y");
		nameList.add("a");

		Collections.sort(nameList);

		for (String string : nameList) {
			// System.out.println(string);
		}

	}

}
