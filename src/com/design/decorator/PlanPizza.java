package com.design.decorator;

public class PlanPizza implements Pizza{

	private String description;
	private Double price;
	
	public PlanPizza(String description, double price){
		this.description = description;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

}
