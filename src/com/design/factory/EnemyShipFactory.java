package com.design.factory;

public class EnemyShipFactory {
	public static EnemyShip makeEnemyShip(String typeOfShip) throws Exception{
		if(typeOfShip.equals("U")){
			return new UFOEnemyShip("UFOShip", 20);
		}else if(typeOfShip.equals("B")){
			return new BigUFOEnemyShip("BigUFOShip", 40);
		}else if(typeOfShip.equals("R")){
			return new RocketShip("Rocket", 45);
		}else {
			throw new Exception("ship type not available");
		}
	} 
}
