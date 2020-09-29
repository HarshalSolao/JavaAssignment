package com.assignment.harshal;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println(getRandomNumber());

	}
	
	public static double getRandomNumber() {
		return Math.random() * 17;
	}

}
