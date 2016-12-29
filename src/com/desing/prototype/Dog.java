package com.desing.prototype;

public class Dog implements Animal {
	public Dog(){
		System.out.println("Dog is made");
	}
	@Override
	public Animal makeAnimal() {
		Dog dogObject = null;
		try {
			dogObject = (Dog) super.clone();
			System.out.println("Dog is being made");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dogObject;
	}
	
	public String toString(){
		return "This is dog";
	}
}
