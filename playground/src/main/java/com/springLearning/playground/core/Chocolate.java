package com.springLearning.playground.core;

public class Chocolate {
	
	private String name;
	
	private String brand;
	
	private double price;

	
	
	public Chocolate(String name, String brand, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", brand=" + brand + ", price=" + price + "] \n";
	}
	
	
	
	

}
