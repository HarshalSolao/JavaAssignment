package com.assignment.sanket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;

public class CollectionMapOperations {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("****=========  ***  On the basis of Luanch Year  ***  ========****");
		System.out.println();
		List<Car> cars = UploadFileData.readDataFromFile();
		Set<Car> carSet = new HashSet<>();

		for (Car car : cars) {
			carSet.add(car);
		}

//		for (Car car : carSet) {
//			System.out.println(car);
//		}

		Map<Integer, List<Car>> map = new HashMap<>();

		for (Car car : cars) {
			if (map.containsKey(car.getLaunchYear())) {
				List<Car> list = map.get(car.getLaunchYear());
				list.add(car);
				map.put(car.getLaunchYear(), list);
			} else {
				List<Car> list = new ArrayList<>();
				list.add(car);
				map.put(car.getLaunchYear(), list);
			}
		}

		for (Integer key : map.keySet()) {
			System.out.println(key + " -- " + map.get(key));
		}
		System.out.println();
		System.out.println("****=========  ***  On the basis of color  ***  ========****");
		System.out.println();
		
		List<Car> cars1 = UploadFileData.readDataFromFile();
		Set<Car> carSet1 = new HashSet<>();

		for (Car car : cars1) {
			carSet.add(car);
		}

//		for (Car car : carSet) {
//			System.out.println(car);
//		}

		Map<String, List<Car>> map1 = new HashMap<>();

		for (Car car : cars1) {
			String color = car.getColor();
			if (map1.containsKey(color)) {
				List<Car> list = map1.get(color);
				list.add(car);
				map1.put(car.getColor(), list);
			} else {
				List<Car> list = new ArrayList<>();
				list.add(car);
				map1.put(car.getColor(), list);
			}
		}

		for (String  key : map1.keySet()) {
			System.out.println(key + " -- " + map1.get(key));
		}

		System.out.println();
System.out.println("****=========  ***  On the basis of Brandname  ***  ========****");
		System.out.println();
		
		List<Car> cars2 = UploadFileData.readDataFromFile();
		Set<Car> carSet2 = new HashSet<>();

		for (Car car : cars2) {
			carSet2.add(car);
		}

//		for (Car car : carSet) {
//			System.out.println(car);
//		}

		Map<String, List<Car>> map2 = new HashMap<>();

		for (Car car : cars2) {
			String BrandName = car.getBrandName();
			if (map2.containsKey(BrandName)) {
				List<Car> list = map2.get(BrandName);
				list.add(car);
				map2.put(car.getBrandName(), list);
			} else {
				List<Car> list = new ArrayList<>();
				list.add(car);
				map2.put(car.getBrandName(), list);
			}
		}

		for (String  key : map2.keySet()) {
			System.out.println(key + " -- " + map2.get(key));
		}


		
	}

}
