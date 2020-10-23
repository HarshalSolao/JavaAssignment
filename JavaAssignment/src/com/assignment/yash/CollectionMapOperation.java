package com.assignment.yash;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;
public class CollectionMapOperation {

	public static void main(String[] args) {
//UploadFileData.readHighValumeDataFromFile() 
		//UploadFileData.readDataFromFile()
		List<Car> cars = UploadFileData.readDataFromFile() ;
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


		Map<Integer,Map<String,List<Car>>>kr=new HashMap<>();   
	 
		for(Car car:cars) { 
			if(kr.containsKey(car.getLaunchYear())) {  
			continue;
			} 
			else {  
				Map<String, List<Car>> m1 = new HashMap<>(); 
				int ans=car.getLaunchYear();
				
				for(Car car1:cars) { 
					if(m1.containsKey(car1.getColor())&&car1.getLaunchYear()==ans) { 
						List<Car>list=m1.get(car1.getColor());
						list.add(car1);
						m1.put(car1.getColor(),list);
					} 
					else if(car1.getLaunchYear()==ans) { 
						List<Car>list=new ArrayList<>(); 
						list.add(car1);
						m1.put(car1.getColor(), list);
					}
				} 
				kr.put(car.getLaunchYear(), m1);
				
			}
		}

		System.out.println("------------------------------------------------------------------------------------------------------------------Using Map Logic----------------------------------------------------------------------------------------------------------------------------------------"); 
for(Integer key:kr.keySet()) { 
	System.out.println(key+"-->"+kr.get(key));
} 
System.out.println("-------------------------------------******************************************************************************************-------------------------------------------------------");
   
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
	for (String  key : map1.keySet()) {
		System.out.println(key + " -- "+map1.get(key));
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
	for (String  key : map2.keySet()) {
		System.out.println(key + " -- "+map2.get(key));
	} 
System.out.println("----------------------------------------------------------------------------------------------------------------------------sorting the car  by car name--------------------------------------------------------------------------------------------------------------------------------------");
	Comparator<Car>cp= Comparator.comparing(Car::getCarName); 
	Collections.sort(cars,cp); 
	for(Car car:cars) {
		System.out.println(car);
	}
	
	System.out.println("----------------------------------------------------*****************************************************************------------------------------------------------------------------------------------------------------------------------------------------);");
	}

}


