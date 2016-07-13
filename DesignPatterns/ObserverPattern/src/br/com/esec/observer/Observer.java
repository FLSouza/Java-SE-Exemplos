package br.com.esec.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
