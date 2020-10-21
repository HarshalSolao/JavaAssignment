package com.assignment.jay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;

public class CollectionMapOperationj {

	public static void main(String []args) {
		List<Car> cars = UploadFileData.readDataFromFile();
		Set<Car> carSet = new HashSet<>();
		
		for (Car car : cars) {
			carSet.add(car); //adding list into the set
			
		}
		System.out.println("#Cars List");
		System.out.println();
		for (Car car : carSet) {
			
			System.out.println(car);
	}
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------------------------");
	
		Map<Integer , List<Car>> map = new HashMap<>();
			
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

		System.out.println("#Seprated Cars List by using CarLaucnchYear   ");
		System.out.println();
		for(Integer key : map.keySet()) {
			
				System.out.println(key + "---------->" + map.get(key));
			
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		Map<String , List<Car>> map1 =new HashMap<>();//intially 0 
		for(Car car1 : cars) {
			
			if (map1.containsKey(car1.getBrandName())) {
				List<Car> list = map1.get(car1.getBrandName()); //access item 
				list.add(car1); //update
				map1.put(car1.getBrandName(), list); //add items
			}else {
				List<Car> list = new ArrayList<>(); // make new list 
				list.add(car1); // update
				map1.put(car1.getBrandName(), list); //add items
			}
		}
		System.out.println("#Seprated Cars List by using CarBrandName ");
		System.out.println();
		for(String key : map1.keySet()) {
			
				System.out.println(key + "--------->"+ map1.get(key));
			
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		Map<String , List<Car> > map2 = new HashMap<>();
		
		for(Car car2 : cars) {
			
			if(map2.containsKey(car2.getColor())) {
				List<Car> list = map2.get(car2.getColor());
				list.add(car2);
				map2.put(car2.getColor(), list);
			}else {
				List<Car> list = new ArrayList<>();
				list.add(car2);
				map2.put(car2.getColor(), list);
			}
		}
		
		System.out.println("#Seprated Cars List by using CarColor");
		System.out.println();
		for(String key : map2.keySet()) {
			
			System.out.println(key + "-------->" + map2.get(key));
		}
	}   
	
	
}
