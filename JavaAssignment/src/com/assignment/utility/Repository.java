package com.assignment.utility;

import java.util.ArrayList;
import java.util.List;

import com.assignment.entity.Car;

/*
 Just create object of this class in your required class and call getCars() method which
 will return List<Car> to use as per your requirement
*/
public class Repository {

	List<Car> cars = new ArrayList<>();

	public Repository() {
		this.cars = UploadFileData.readHighValumeDataFromFile();
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public void setCar(Car car) {
		this.cars.add(car);
	}
}
