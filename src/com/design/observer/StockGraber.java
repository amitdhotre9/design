package com.design.observer;

import java.util.ArrayList;

public class StockGraber implements Subject {
	private ArrayList<Observer> observerList;
	private double ibmPrice;
	private double applPrice;
	StockGraber(){
		this.observerList = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer newObserver) {
		observerList.add(newObserver);
	}

	@Override
	public void unregister(Observer newObserver) {
		// TODO Auto-generated method stub
		int index = observerList.indexOf(newObserver);
		observerList.remove(index);
		System.out.println("removed observer at : " + index);
	}

	public void notifyObserver() {
		observerList.forEach(observer -> observer.update(this.ibmPrice, this.applPrice));
	}
	
	public void setIBMPrice(double idmPrice){
		this.ibmPrice = idmPrice;
		System.out.println("IBM price : " + this.ibmPrice);
		notifyObserver();
	}
	
	public void setAPPLEPrice(double applPrice){
		this.applPrice = applPrice;
		System.out.println("Apple Price : " + this.applPrice);
		notifyObserver();
	}

}
