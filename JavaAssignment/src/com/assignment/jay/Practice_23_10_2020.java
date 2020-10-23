package com.assignment.jay;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.assignment.entity.Car;
import com.assignment.utility.UploadFileData;

public class Practice_23_10_2020 {
	int sort ;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Practice_23_10_2020 pra = new Practice_23_10_2020();
		
		List<Car> carsdeta = UploadFileData.readDataFromFile();
		Set<Car> carSet= new HashSet<>();
		carSet.addAll(carsdeta);
		
		System.out.println(" ****Sort Your List with different way**** ");
		System.out.println();
			
		do {
			pra.getSortoptions();	
			
			try {
				pra.sort  = in.nextInt(); //getting choice from user
			}catch(Exception e) {
				System.out.println("Please enter valid choice :("  );
				break;
			}
			
			
			switch(pra.sort) {
			case 1 :
			System.out.println("Sorting Custome deta type using CarName:");
			System.out.println();
			Comparator<Car> cm1 = Comparator.comparing(Car::getCarName);
			Collections.sort(carsdeta,cm1); 
			for(Car car : carsdeta) {
				System.out.println(car);
			}
			System.out.println("--------------------------------------------");
			System.out.println();
			break;
			case 2:
				System.out.println("Sorting Custome deta type using CarBramdName:");
				System.out.println();
				Comparator<Car> cm2 = Comparator.comparing(Car::getBrandName);
				Collections.sort(carsdeta,cm2);
				for(Car car : carsdeta) {
					System.out.println(car);
				}
				System.out.println("--------------------------------------------");
				System.out.println();
				break;
			case 3:
				System.out.println("Sorting Custome deta type using CarLaunchYear:");
				System.out.println();
				Comparator<Car> cm3 = Comparator.comparing(Car::getLaunchYear);
				Collections.sort(carsdeta, cm3);
				for(Car car : carsdeta) {
					System.out.println(car);
				}
				System.out.println("--------------------------------------------");
				System.out.println(); 
				break;
				
			case 4:
				System.out.println("Sorting Custome deta type using CarColo:r");
				System.out.println();
				Comparator<Car> cm4 = Comparator.comparing(Car::getColor);
				Collections.sort(carsdeta, cm4);
				for(Car car : carsdeta) {
					System.out.println(car);
				}
				System.out.println("--------------------------------------------");
				System.out.println();
				break;
			default :
				System.out.println(" :( Something went wrong!!!");
				System.out.println();
				break;
			}
			
		}while(true);
		
		}
	public void getSortoptions() {
		System.out.println("Press 1 for soting car deta using CarName");
		System.out.println("Press 2 for soting car deta using CarBrandName");
		System.out.println("Press 3 for soting car deta using CarLaunchYear");
		System.out.println("Press 4 for soting car deta using CarColor");
	}

}
