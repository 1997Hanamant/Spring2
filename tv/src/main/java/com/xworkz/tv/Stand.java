package com.xworkz.tv;

public class Stand {
private	 String name;
private	 Double price;
	public Stand() {
	System.out.println(this.getClass().getSimpleName()+"Stand bean is created");
	}
	
	public Stand(String name) {
		this.name = name;
	}

	public Stand(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stand [name=" + name + ", price=" + price + "]";
	}	

}
