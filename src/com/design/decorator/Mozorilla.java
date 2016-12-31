package com.design.decorator;

public class Mozorilla implements Pizza{

	private String description;
	private Double price;
	private Pizza pizza;
	public Mozorilla(Pizza pizza, String description, Double price){
		this.pizza = pizza;
		this.description = description;
		this.price = price;
	}
	public String getDescription() {
		return  description + ", " + pizza.getDescription();
	}

	@Override
	public Double getPrice() {
		return pizza.getPrice() + price;
	}
}
