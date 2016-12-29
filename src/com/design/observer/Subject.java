package com.design.observer;

public interface Subject {
	public void register(Observer newObserver);
	public void unregister(Observer newObserver);
	public void notifyObserver();
}
