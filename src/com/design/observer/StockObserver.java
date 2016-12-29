package com.design.observer;

public class StockObserver implements Observer {

	private Subject subject;
	StockObserver(Subject subject){
		this.subject = subject;
		this.subject.register(this);
	}
	@Override
	public void update(double ibmPrice, double applePrice) {
		System.out.println("ibmPrice : " + ibmPrice + " apple price : " + applePrice);
	}

}
