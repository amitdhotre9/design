package com.design.strategy;

import java.util.ArrayList;
import java.util.List;

public class PlayingWithAnimals {
	public static void main(String[] args){
		Animal a1 = new Dog("doggy");
		Animal a2 = new Bird("birddy");
		a1.setSound("bark bark...");
		a2.setSound("tweety tweety...");
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(a1);
		animalList.add(a2);
		animalList.forEach(a -> a.makeSound());
		a1.setFlayingAbility(new ItFlys());
		a2.setFlayingAbility(new CantFly());
		animalList.forEach(a -> a.fly());
	}
}
