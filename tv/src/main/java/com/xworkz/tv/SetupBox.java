package com.xworkz.tv;

public class SetupBox {
	private	 String name;
	private	 Double price;


	public SetupBox(String name) {
		this.name = name;
	}

	public SetupBox(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public SetupBox() {
		System.out.println(this.getClass().getSimpleName()+"SetupBox Bean is created");
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





}
