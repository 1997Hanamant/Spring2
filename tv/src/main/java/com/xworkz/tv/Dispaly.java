package com.xworkz.tv;

public class Dispaly {
private	Double price;
private	String name;

	public Dispaly() {
		System.out.println(this.getClass().getSimpleName() + " " + "Dispaly bean is created");
	}

	public Dispaly(Double price) {
		this.price = price;
	}

	public Dispaly(Double price, String name) {
		this.price = price;
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dispaly [price=" + price + ", name=" + name + "]";
	}

}
