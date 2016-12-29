package com.desing.prototype;

public class ClonFactory {
	public static Animal makeAnimal(Animal animal){
		return animal.makeAnimal();
	}
}
