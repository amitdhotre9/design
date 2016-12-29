package com.design.factory;

public class EnemyShip {
	private String name;
	private double amtDamage;
	EnemyShip(String name,  double amtDamage){
		this.name = name;
		this.amtDamage = amtDamage;
	}
	
	public void displayShip(){
		System.out.println(name + " is on screen");
	}
	
	public void followHero(){
		System.out.println(name + " is following hero ship");		
	}
	
	public void attachEnemy(){
		System.out.println(name + " is attaching enemy with damage potential : " + amtDamage);
	}
}
