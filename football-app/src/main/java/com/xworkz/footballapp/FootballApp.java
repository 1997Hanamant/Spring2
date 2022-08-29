package com.xworkz.footballapp;

public class FootballApp {
	public String brand;
	public Boolean isAirFilled;
	public String color;
	public Double price;

	// public FootballApp() {
	// System.out.println(this.getClass().getSimpleName()+" "+"bean is );
	// }

	// bean initialization//
	public FootballApp(String brand) {
		this.brand = brand;
	}

	public FootballApp(String brand, Boolean isAirFilled) {
		this.brand = brand;
		this.isAirFilled = isAirFilled;
	}

	public FootballApp(String brand, Boolean isAirFilled, String color) {
		this.brand = brand;
		this.isAirFilled = isAirFilled;
		this.color = color;
	}

	public FootballApp(String brand, Boolean isAirFilled, String color, Double price) {
		this.brand = brand;
		this.isAirFilled = isAirFilled;
		this.color = color;
		this.price = price;
	}

}
