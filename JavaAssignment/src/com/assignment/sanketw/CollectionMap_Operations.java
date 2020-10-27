package com.assignment.sanketw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;

public class CollectionMap_Operations {

	public static void main(String[] args) {

		List<Car> cars = UploadFileData.readDataFromFile();
		System.out.println("List of Data of Cars: ");
		for (Car car : cars) {
			System.out.println(car);
		}

		Set<Car> carset = new HashSet<>();
		for (Car car : cars) {
			carset.add(car);
		}
		System.out.println("=================================================================================");

		System.out.println("To print data of cars according to LaunchYear");
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

		System.out.println("=================================================================================");

		System.out.println("To print data of cars according to BrandName");
		Map<String, List<Car>> map1 = new HashMap<>();

		for (Car car : cars) {
			if (map1.containsKey(car.getBrandName())) {
				List<Car> list = map1.get(car.getBrandName());
				list.add(car);
				map1.put(car.getBrandName(), list);
			} else {
				List<Car> list = new ArrayList<>();
				list.add(car);
				map1.put(car.getBrandName(), list);
			}
		}

		for (String key : map1.keySet()) {
			System.out.println(key + " -- " + map1.get(key));
		}

		System.out.println("=================================================================================");

		System.out.println("To print data of cars according to Colour");
		Map<String, List<Car>> map2 = new HashMap<>();

		for (Car car : cars) {
			if (map2.containsKey(car.getColor())) {
				List<Car> list = map2.get(car.getColor());
				list.add(car);
				map2.put(car.getColor(), list);
			} else {
				List<Car> list = new ArrayList<>();
				list.add(car);
				map2.put(car.getColor(), list);
			}
		}

		for (String key : map2.keySet()) {
			System.out.println(key + " -- " + map2.get(key));
		}

		System.out.println("=================================================================================");

		System.out.println("To print data of cars according to LaunchYear and colour");

		Map<Integer, Map<String, List<Car>>> map3 = new HashMap<>();

		for (Car car : cars) {
			if (map3.containsKey(car.getLaunchYear())) {
				continue;
			} else {
				Map<String, List<Car>> map4 = new HashMap<>();
				int a = car.getLaunchYear();

				for (Car car1 : cars) {
					if (map4.containsKey(car1.getColor()) && car1.getLaunchYear() == a) {
						List<Car> list = map4.get(car1.getColor());
						list.add(car1);
						map4.put(car1.getColor(), list);
					} else if (car1.getLaunchYear() == a) {
						List<Car> list = new ArrayList<>();
						list.add(car1);
						map4.put(car1.getColor(), list);
					}
				}
				map3.put(car.getLaunchYear(), map4);
			}
		}
		for (Integer key : map3.keySet()) {
			System.out.println(key + " -- " + map3.get(key));
		}
	}
}
