package com.design.strategy;

public class Animal {
	private String name;
	private String sound;
	private Flys flyingType;
	
	public Animal(String name){
		this.name = name;
	}
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return this.name;
	}

	void setSound(String sound){
		this.sound = sound;
	}
	
	void makeSound(){
		System.out.println("making sound : " + this.sound + "....");
	}
	
	void setFlayingAbility(Flys flyingType){
		this.flyingType = flyingType;
	}

	void fly(){
		flyingType.fly();
	}
}
