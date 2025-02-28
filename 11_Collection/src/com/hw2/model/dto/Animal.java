package com.hw2.model.dto;

public abstract class Animal {
	public Animal() {	}
	protected String name;
	public Animal(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void sound();

}
