package com.assignment.harshal;

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
			System.out.println(key + " -- "+map.get(key));
		}

	}

}
