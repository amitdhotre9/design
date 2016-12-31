package com.design.decorator;

public class PizzaMaker {

	public static void main(String[] args) {
		Pizza mypizza = new PlanPizza("Plan dough", 4.00);
		Pizza addMoz = new Mozorilla(mypizza, "Mozollira", 2.98);
		Pizza addParmesan = new Parmesan(addMoz, "Parmesan", 1.45);
		System.out.println("Description : " + addParmesan.getDescription() + " Price :" + addParmesan.getPrice());
	}
}
