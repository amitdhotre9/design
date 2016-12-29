package com.desing.prototype;

public class Sheep implements Animal{

	public Sheep(){
		System.out.println("Sheep is made");
	}
	@Override
	public Animal makeAnimal() {
		Sheep sheepObject = null;
		try {
			sheepObject = (Sheep) super.clone();
			System.out.println("Sheep is being made");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheepObject;
	}
	public String toString(){
		return "This is sheep";
	}
}
