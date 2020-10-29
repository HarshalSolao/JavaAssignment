package com.assignment.sanketw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;

public class Practice_21_10_2020 {
	// Collection Sorting - 1) Comparable 2) Comparator

	public static void main(String[] args) {

		List<Car> car = UploadFileData.readDataFromFile();
		Set<Car> carSet = new HashSet<>();

		carSet.addAll(car);
		
		System.out.println("Set Collection");
		for (Car car2 : carSet) {
			System.out.println(car2);
		}
		System.out.println("============================================================================");
		System.out.println();

		List<String> namelist = new ArrayList<>();
		namelist.add("Java");
		namelist.add("Ruby");
		namelist.add("Python");
		namelist.add("CPP");

		Collections.sort(namelist);

		System.out.println("Sorting Collection by sort method");
		for (String string : namelist) {
			System.out.println(string);
		}
		System.out.println("============================================================================");

		List<Car> car1 = UploadFileData.readHighValumeDataFromFile();

		Comparator<Car> cm = Comparator.comparing(Car::getBrandName);

		Collections.sort(car1, cm);

		System.out.println("Sorting Collection by Comparator");
		for (Car car2 : car1) {
			System.out.println(car2);
		}

	}

}
