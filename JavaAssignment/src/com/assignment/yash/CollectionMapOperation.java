package com.assignment.yash;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;
public class CollectionMapOperation {

	public static void main(String[] args) {

		List<Car> cars = UploadFileData.readDataFromFile();
System.out.println("-------------------------------------------------Listing a data with comman Launch year--------------------------------------------------");
System.out.println();
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
		System.out.println();	
		System.out.println("-------------------------------------------------Listing a data with comman Brand Name--------------------------------------------------"); 
		System.out.println();
		Map<String,List<Car>>map1=new HashMap<>();
	for(Car car:cars) {  
		if(map1.containsKey(car.getBrandName())) { 
			List<Car>list=map1.get(car.getBrandName());
			list.add(car);
			map1.put(car.getBrandName(),list);
		} else { 
			List<Car>list=new ArrayList<>(); 
			list.add(car);
			map1.put(car.getBrandName(), list);
		}
		
	} 
	for (Entry<String, List<Car>> key : map1.entrySet()) {
		System.out.println(key);
	}
	System.out.println();	
	System.out.println("-------------------------------------------------Listing a data with comman Cars Color--------------------------------------------------");
    System.out.println();	
	Map<String,List<Car>>map2=new HashMap<>(); 
	for(Car car:cars) { 
		if(map2.containsKey(car.getColor())) { 
			List<Car>list=map2.get(car.getColor());
			list.add(car);
			map2.put(car.getColor(),list);
		} 
		else { 
			List<Car>list=new ArrayList<>(); 
			list.add(car);
			map2.put(car.getColor(), list);
		}
	} 
	for (Entry<String, List<Car>> key : map2.entrySet()) {
		System.out.println(key);
	} 

	}

}


