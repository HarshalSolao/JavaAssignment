package com.assignment.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.assignment.entity.Car;

public class UploadFileData {

	public static List<Car> readDataFromFile() {
		BufferedReader reader;
		List<Car> cars = new ArrayList<>();
		try {
			reader = new BufferedReader(new FileReader("CarData.txt"));
			String line = reader.readLine();
			while (line != null) {

				String[] rowData = line.split("~~");
				Car car = new Car(rowData[0].trim(), rowData[1].trim(), Integer.parseInt(rowData[2].trim()),
						rowData[3].trim());
				cars.add(car);

				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

		return cars;

	}
	
	public static List<Car> readHighValumeDataFromFile() {
		List<Car> cars = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File("MOCK_DATA.txt"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] rowData = line.split("~");
				Car car = new Car(rowData[0].trim(), rowData[1].trim(), Integer.parseInt(rowData[2].trim()),
						rowData[3].trim());
				cars.add(car);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return cars;

	}
	
	
	
	
}
