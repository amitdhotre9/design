package com.design.strategy;

public class CantFly implements Flys {

	@Override
	public void fly() {
		System.out.println("cant fly");
	}

}
