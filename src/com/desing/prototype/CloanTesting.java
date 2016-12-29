package com.desing.prototype;

public class CloanTesting {
	public static void main(String[] argv){
		Sheep sheep = new Sheep();
		Dog dog = new Dog();
		
		Animal a1 = ClonFactory.makeAnimal(sheep);
		Animal a2 = ClonFactory.makeAnimal(dog);
		System.out.println(a1);
		System.out.println(a2);		
	}
}
