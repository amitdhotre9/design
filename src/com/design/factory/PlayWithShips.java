package com.design.factory;

import java.util.Scanner;

public class PlayWithShips {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EnemyShip ship = null;
		if(input.hasNext()){
			String typeOfShip = input.nextLine();
			try {
				ship = EnemyShipFactory.makeEnemyShip(typeOfShip);
				doStuff(ship);
			} catch (Exception e) {
				System.out.println("Invalid input : " + e.getMessage());
			}
		}
		

	}

	private static void doStuff(EnemyShip ship) {
		ship.displayShip();
		ship.followHero();
		ship.attachEnemy();
	}

}
